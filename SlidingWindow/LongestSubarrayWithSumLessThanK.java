package SlidingWindow;
import java.util.*;

public class LongestSubarrayWithSumLessThanK {
    public static int longestSubarraylessthanK(int[] array, int size, int k){
        int maxLength = 0, windowSum = 0, left = 0;

        for(int right = 0; right < size; right++){
            windowSum += array[right];
            while(windowSum > k && left <= right){
                windowSum -= array[left];
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength == 0 ? 0 : maxLength;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int []array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Enter value of k: ");
        int k = scan.nextInt();
        System.out.println("Longest subarray with sum ≤ `K`: ");
        int result = longestSubarraylessthanK(array, size, k);
        System.out.println(result);
        scan.close();
    }
}
