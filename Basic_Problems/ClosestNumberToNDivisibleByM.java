package Basic_Problems;
import java.util.*;

public class ClosestNumberToNDivisibleByM {
    public static int closestNumber(int number, int divisor){
        int quotient = number / divisor;
        int n1 = divisor * quotient;
        int n2 = number * divisor > 0 ? divisor * (quotient + 1) : divisor * (quotient - 1);
        if(Math.abs(number - n1) < Math.abs(number - n2)){
            return n1;
        }
        return n2;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor = scan.nextInt();
        System.out.println("Closed number to N dividible by M: "+ closestNumber(number, divisor));
        scan.close();
    }
}
