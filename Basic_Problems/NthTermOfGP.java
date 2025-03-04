package Basic_Problems;
import java.util.*;

public class NthTermOfGP {
    public static int nthTerm(int initialNUmber, int number, int difference){
        int nTerm = initialNUmber;
        for(int i = 1; i < number; i++){
            nTerm *= difference;
        }
        return nTerm;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter initial number: ");
        int initialNumber = scan.nextInt();
        System.out.println("Enter the Nth number: ");
        int number = scan.nextInt();
        System.out.println("Enter the difference between numbers: ");
        int difference = scan.nextInt();
        System.out.println("The Nth term of GP: "+nthTerm(initialNumber, number, difference));
        scan.close();
    }
}
