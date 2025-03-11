package EasyProblems;
import java.util.*;

public class SumOfSeries2 {
    public static double sum(int number){
        double sum = 0;
        sum = 2 * ( 1 - 1 / Math.pow(10, number)) / 3;
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int number = scan.nextInt();
        System.out.println("the sum of series 0.6 + 0.06 + 0.006 + ... : "+sum(number));
        scan.close();

    }
}
