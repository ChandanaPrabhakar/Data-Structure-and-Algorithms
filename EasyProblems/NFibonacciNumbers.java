package EasyProblems;
import java.util.*;

public class NFibonacciNumbers {
    public static void fibonacciNumbers(int number){
        int a = 0, b = 1;
        System.out.print(a+" "+b+" ");
        for(int i = 2; i < number; i++){
            int c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int number = scan.nextInt();
        System.out.println("N fibonacci numbers : ");
        fibonacciNumbers(number);
        scan.close();
    }
}
