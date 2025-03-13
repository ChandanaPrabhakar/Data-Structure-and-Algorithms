package EasyProblems;
import java.util.*;

public class NthTermSeriesI {
    public static int nthTerm(int number){
        int sum = 0;
        for(int i = 1; i <= number; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int number = scan.nextInt();
        System.out.println("Nth term in series 1, 3, 6, 10, 15, 21,.... : "+nthTerm(number));
        scan.close();
    }
}
