package Basic_Problems;
import java.util.*;

public class NthTermOfAP {
    public static int nthTerm(int initialNumber, int number, int difference){
        return initialNumber + (number - 1) * difference;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the initial number: ");
        int initialNumber = scan.nextInt();
        System.out.println("Enter the Nth number: ");
        int number = scan.nextInt();
        System.out.println("Enter the difference between numbers: ");
        int difference = scan.nextInt();
        System.out.println("Nth term of AP: "+ nthTerm(initialNumber, number, difference));
        scan.close();
    }
}
