package Basic_Problems;
import java.util.*;

public class PerfectNumber {
    public static boolean checkForPerfectNumber(int number){
        int sum = 1;
        for(int i = 2; i*i <= number; i++){
            if(number % i == 0){
                if(i * i != number){
                    sum += i + number/i;
                }else{
                    sum += i;
                }
            }
        }
        if(sum == number && number != 1){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("Is is perfect or not: "+checkForPerfectNumber(number));
        scan.close();
    }
}
