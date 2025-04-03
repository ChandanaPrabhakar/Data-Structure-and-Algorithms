package SlidingWindow;
import java.util.*;

public class LongestZerosFlippedOnes {
    public static int longestZerosFlippedOnes(int[] array, int size, int k){
        int maxLength = 0, left = 0, zeroCount = 0;
        for(int right = 0; right < size; right++){
            if(array[right] == 0) zeroCount++;
            while(zeroCount > k){
                if(array[left] == 0) zeroCount--;
                left++;
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
        System.out.println("Enter window size: ");
        int k = scan.nextInt();
        System.out.println("Longest subarray with at most `K` zeros flipped to ones: ");
        int result = longestZerosFlippedOnes(array, size, k);
        System.out.println(result);
        scan.close();
    }
}
