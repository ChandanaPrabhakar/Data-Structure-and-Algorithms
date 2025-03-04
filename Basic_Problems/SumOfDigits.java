package Basic_Problems;
import java.util.*;

public class SumOfDigits {
    public static int sumOfDigits(int number){
        int sum = 0;
        while(number > 0){
            int remainder = number%10;
            sum = sum + remainder;
            number = number / 10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("The sum of digits: " +sumOfDigits(number));
        scan.close();
    }
}
