package Basic_Problems;
import java.util.*;

public class SumOfFactorials {

    public static int sumFactorials(int number){
        int factorialSum = 0, factorial = 1;
        for(int i = 1; i <= number; i++){
            factorial *= i;
            factorialSum += factorial;
        }
        return factorialSum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("Sum of factorials: "+sumFactorials(number));
        scan.close();
    }
}
