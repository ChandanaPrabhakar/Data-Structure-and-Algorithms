package Basic_Problems;
import java.util.*;

public class SeriesSum {
    public static int seriesSumOfNaturalNumbers(int number){
        int sum = 0;
        for(int i = 1; i <= number; i++){
            sum += i * (i + 1) / 2;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int number = scan.nextInt();

        System.out.println("The sum of sum of natural numbers: "+seriesSumOfNaturalNumbers(number));
        scan.close();
    }
}
