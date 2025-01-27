package Recursion;
import java.util.*;

public class CoinChange {
    public static int CountWaysToMakeSum(int[] coin, int size, int sum){
        if(sum == 0){
            return 1;
        }
        if(sum < 0 || size == 0){
            return 0;
        }
        return CountWaysToMakeSum(coin, size-1, sum) + CountWaysToMakeSum(coin, size, sum-coin[size-1]);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int size = scan.nextInt();
        System.out.println("Enter coin denomination: ");
        int coin[] = new int[size];
        for(int i = 0; i < size; i++){
            coin[i] = scan.nextInt();
        }
        System.out.println("Enter the sum: ");
        int sum = scan.nextInt();
        System.out.println(CountWaysToMakeSum(coin, size, sum));
        scan.close();
    }
}
