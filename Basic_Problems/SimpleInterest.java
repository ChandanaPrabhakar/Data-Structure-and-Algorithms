package Basic_Problems;
import java.util.*;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        float principalAmount = scan.nextFloat();
        System.out.println("Enter the time: ");
        float time = scan.nextFloat();
        System.out.println("Enter the rate of interest: ");
        float rate = scan.nextFloat();

        float simpleInterest = (principalAmount * time * rate) / 100;
        System.out.println("Simple Interest: "+ simpleInterest);
        scan.close();
    }
}
