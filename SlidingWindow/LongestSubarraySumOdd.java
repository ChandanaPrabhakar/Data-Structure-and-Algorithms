package SlidingWindow;
import java.util.*;

public class LongestSubarraySumOdd {
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            int remainder = n % 10;
            sum += remainder;
            n /= 10;
        }
        return sum;
    }

    public static int longestSubarrayWithOddSum(int[] array, int size){
        int maxLength = 0, left = 0;

        for(int right = 0; right < size; right++){
            if(sumOfDigits(array[right]) % 2 == 0){
                left = right + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
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
        System.out.println("the longest subarray where the sum of digits of elements is odd: ");
        int result = longestSubarrayWithOddSum(array, size);
        System.out.println(result);
        scan.close();
    }
}
