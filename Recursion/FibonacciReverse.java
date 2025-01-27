package Recursion;
import java.util.*;

public class FibonacciReverse {
    public static void ReverseFibonacci(int num, int a, int b){
        if(num > 0){
            ReverseFibonacci(num-1, b, b+a);
            System.out.print(a + " ");
        }
    } 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number(num): ");
        int num = scan.nextInt();
        ReverseFibonacci(num, 0 , 1);
        scan.close();
    }
}
