package SlidingWindow;
import java.util.*;

public class CountSubarraySumElementPalindrome {
    public static boolean ispalindrome(int n){
        int original = n;
        int reverse = 0;
        while(n > 0){
            int remainder = n % 10;
            reverse = (reverse * 10) + remainder;
            n /= 10;
        }
        return reverse == original ? true : false;
    }
    public static int longestSubarraySumPalindrome(int[] array, int size){
        int maxLength = 0, windowSum = 0;

        for(int right = 0; right < size; right++){
            for(int left = right; left < size; left++){
                windowSum += array[left];
                if(ispalindrome(windowSum)) maxLength = Math.max(maxLength, right - left + 1);
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
        System.out.println("the longest subarray where the sum of elements is a palindrome: ");
        int result = longestSubarraySumPalindrome(array, size);
        System.out.println(result);
        scan.close();
    }
}
