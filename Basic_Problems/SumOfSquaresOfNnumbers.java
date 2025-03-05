package Basic_Problems;
import java.util.*;

public class SumOfSquaresOfNnumbers {
    public static int sumOfSquares(int number){
        int sum = 0;
        while(number > 0){
            sum += number * number;
            number = number - 1;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int number = scan.nextInt();
        System.out.println("The sum of squares of N natural number: "+ sumOfSquares(number));
        scan.close();
    }
}
