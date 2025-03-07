package Basic_Problems;
import java.util.*;

public class CoPrime {
    public static int gcdOfTwoNumbers(int number1, int number2){
        if(number1 == 0) return number2;
        if(number2 == 0) return number1;

        return gcdOfTwoNumbers(number2, number1 % number2);
    }
    public static boolean checkForCoPrime(int number1, int number2){
        int gcd = gcdOfTwoNumbers(number1, number2);
        if(gcd == 1){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ener two prime numbers: ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.println("Is co-prime: "+checkForCoPrime(number1, number2));
        scan.close();
    }
}
