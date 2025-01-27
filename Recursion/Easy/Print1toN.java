package Recursion.Easy;
import java.util.*;

public class Print1toN {
    public static void PrintOneToNum(int num){
        if(num>0){
            PrintOneToNum(num-1);
            System.out.print(num+" ");
        }
        return;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer num: ");
        int num = scan.nextInt();
        PrintOneToNum(num);
        scan.close();
    }
}
