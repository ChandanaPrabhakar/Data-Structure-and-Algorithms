package Recursion;
import java.util.*;

public class DecToBin {
    public static int DecimalToBinary(int dec){
        if(dec == 0){
            return 0;
        }
        return dec%2 + 10*DecimalToBinary(dec/2);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter decimal number:  ");
        int dec = scan.nextInt();
        System.out.println(DecimalToBinary(dec));
        scan.close();
    }
}
