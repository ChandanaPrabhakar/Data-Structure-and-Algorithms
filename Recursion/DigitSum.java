package Recursion;
import java.util.*;

public class DigitSum {
    public static int SumOfDigitsOfNum(int num){
        if(num < 1 ){
            return 0;
        }
        return num % 10 + (SumOfDigitsOfNum(num / 10)); 
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        System.out.println(SumOfDigitsOfNum(num));
        scan.close();
    }
}
