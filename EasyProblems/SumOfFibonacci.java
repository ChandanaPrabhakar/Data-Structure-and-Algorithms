package EasyProblems;
import java.util.*;

public class SumOfFibonacci {
    public static int sum(int number){
        int a = 0, b = 1;
        int sum = a+b;
        for(int i = 2; i <= number; i++){
            int c = a + b;
            sum += c;
            a = b;
            b = c;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int number = scan.nextInt();
        System.out.println("The sum of n fibonacci numbers: "+sum(number));
        scan.close();
    }
}
