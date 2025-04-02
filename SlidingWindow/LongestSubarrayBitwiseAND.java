package SlidingWindow;
import java.util.*;

public class LongestSubarrayBitwiseAND {
    public static int longestSubarrayBitwiseAND(int[] array, int size){
        int maxLength = 0, currentAND = array[0], left = 0;

        for(int right = 0; right < size; right++){
            currentAND &= array[right];
            while (currentAND == 0 && left <= right) {
                left++;
                if (left <= right) {
                    currentAND = array[left];
                    for (int i = left; i <= right; i++) {
                        currentAND &= array[i];
                    }
                }
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
        System.out.println("the longest subarray where the bitwise AND of all elements is > 0: ");
        int result = longestSubarrayBitwiseAND(array, size);
        System.out.println(result);
        scan.close();
    }
}
