package Recursion.Easy;
import java.util.*;

public class PrintNto1 {
    public static void PrintNumToOne(int num){
        if(num > 0){
            System.out.print(num+" ");
            PrintNumToOne(num-1);
        }
        return;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integernum: ");
        int num = scan.nextInt();
        PrintNumToOne(num);
        scan.close();
    }
}
