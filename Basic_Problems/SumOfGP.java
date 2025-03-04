package Basic_Problems;
import java.util.*;

public class SumOfGP {
    public static float sumOfGP(float initialNumber, float r, int number){
        float sum = 0;
        for(int i = 1; i <= number; i++){
            sum = sum + initialNumber;
            initialNumber = initialNumber * r;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the initial number: ");
        int initialNumber = scan.nextInt();
        System.out.println("Enter the difference: ");
        float r = scan.nextFloat();
        System.out.println("Enter total number of element: ");
        int number = scan.nextInt();
        System.out.println("Sum of numbers in GP: "+ sumOfGP(initialNumber, r, number));
        scan.close();
    }
}
