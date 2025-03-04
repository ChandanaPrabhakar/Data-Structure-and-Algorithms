package Basic_Problems;
import java.util.*;

public class SumOfNaturalNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the natural number: ");
        int number = scan.nextInt();
        int sum = number * (number + 1) / 2;
        System.out.println("The sum of natural numbers : "+sum);
        scan.close();
    }
}
