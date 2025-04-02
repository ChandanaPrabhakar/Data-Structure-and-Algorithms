package SlidingWindow;
import java.util.*;

public class LongestSubarraySameElements {
    public static int longestSubarrayOfSameElements(int[] array, int size){
        int currentLength = 0, maxLength = 0;
        for(int i = 1; i < size; i++){
            if(array[i] == array[i - 1]){
                currentLength++;
            }else{
                currentLength = 1;
            }
            maxLength = Math.max(maxLength, currentLength);
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
        System.out.println("the longest subarray where all elements are equal: ");
        int result = longestSubarrayOfSameElements(array, size);
        System.out.println(result);
        scan.close();
    }
}
