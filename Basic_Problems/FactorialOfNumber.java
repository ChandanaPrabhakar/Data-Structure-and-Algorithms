package Basic_Problems;
import java.util.*;

public class FactorialOfNumber {
    public static int factorial(int number){
        int factorial = 1;
        for(int i = 1; i <= number; i++){
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("The factorial of number: "+ factorial(number));
        scan.close();
    }
}
