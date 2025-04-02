package SlidingWindow;
import java.util.*;

public class LongestSubarrayOfPrime {
    public static boolean isPrime(int n){
        if(n < 2) return false;

        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static int longestSubarrayAllPrime(int[] array, int size){
        int maxLength = 0, currentLength = 0;
        for(int i = 0; i < size; i++){
            if(isPrime(array[i])){
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            }else{
                currentLength = 1;
            }
        }
        return maxLength;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int [] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("the longest subarray where all elements are prime: ");
        int result = longestSubarrayAllPrime(array, size);
        System.out.println(result);
        scan.close();
    }
}
