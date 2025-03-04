package Basic_Problems;
import java.util.*;

public class SwapTwoNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int number2 = scan.nextInt();
        System.out.println("Number 1: "+number1+" Number 2: "+number2);
        int temporaryVariable = number1;
        number1 = number2;
        number2 = temporaryVariable;
        System.out.println("Number 1: "+number1+" Number 2: "+number2);
        scan.close();
    }
}
