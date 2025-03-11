package EasyProblems;
import java.util.*;

public class DigitalRoot {
    public static int sum(int number){
        int totalSum = 0, digitSum = 0;
        while(number > 0){
            int rem = number % 10;
            digitSum += rem;
            number /= 10;
        }
        if(digitSum >= 10){
            while(digitSum > 0){
                int rem = digitSum % 10;
                totalSum += rem;
                digitSum /= 10;
            }
            return totalSum;
        }else{
            return digitSum;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int number = scan.nextInt();
        System.out.println("Digital Root (repeated digital sum) of the given large integer: "+sum(number));
        scan.close();
    }
}
