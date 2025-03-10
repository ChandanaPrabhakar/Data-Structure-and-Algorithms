package Basic_Problems;
import java.util.*;

public class StrongNumber {
    static int[] fact = new int[10];
    public static void precompute(){
        fact[0] = fact[1] = 1;
        for(int i = 2; i < 10; i++){
            fact[i] = i * fact[i - 1];
        }
    }

    public static boolean strongNumber(int number){
        int temporaryVariable = number;
        int factorialSum = 0;
        while(temporaryVariable > 0){
            factorialSum += fact[temporaryVariable % 10];
            temporaryVariable /= 10;
        }
        if(number == factorialSum){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        precompute();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("Is the number strong: "+strongNumber(number));
        scan.close();
    }
}
