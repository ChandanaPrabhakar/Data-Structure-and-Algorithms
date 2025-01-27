package Recursion.Easy;
import java.util.*;

public class FactorialRecur {

    public static int factorial(int num){
        if(num == 0 || num == 1 ){
            return 1;
        }
        return num * factorial(num - 1);
        
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.print(factorial(num));
        scan.close();
    }
}
