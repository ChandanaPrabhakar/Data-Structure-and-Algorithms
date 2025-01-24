package Recursion;
import java.util.*;

public class SumNaturalNumbers {
    public static int SumOfNaturalNumbers(int num){
        if(num < 1){
            return 0;
        }
        return num + SumOfNaturalNumbers(num-1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the natural number: ");
        int num = scan.nextInt();
        System.out.println(SumOfNaturalNumbers(num));
        scan.close();
    }
}
