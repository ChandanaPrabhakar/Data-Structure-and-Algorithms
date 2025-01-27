package Recursion.Easy;
import java.util.*;

public class countSetBits {
    public static int CountSetBits(int num){
        if(num == 0){
            return 0;
        }
        if((num & 1)== 1){
            return 1 + CountSetBits(num >> 1);
        }
        return CountSetBits(num >> 1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = scan.nextInt();
        System.out.println(CountSetBits(num));
        scan.close();
    }
}
