package EasyProblems;
import java.util.*;

public class NthTermInSeries {
    public static double nthTerm(int number){
        return Math.pow(number, 2) + Math.pow(number, 3);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int number = scan.nextInt();
        System.out.println("The Nth term of series 2, 12, 36, 80, 150, .. : "+nthTerm(number));
        scan.close();
    }
}
