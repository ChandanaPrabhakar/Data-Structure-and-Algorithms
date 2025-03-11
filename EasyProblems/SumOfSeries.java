package EasyProblems;
import java.util.*;

public class SumOfSeries {
    public static double sum(int number){
        return (number * (2 * number - 1) * (2 * number + 1)) / 3;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("The sum of series 1^2 + 3^2 + 5^2 + .... : "+ sum(number));
        scan.close();
    }
}
