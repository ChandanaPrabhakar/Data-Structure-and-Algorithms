package SlidingWindow;
import java.util.*;

public class CountSubarraysSumEven {
    public static int countSubarraysWithEvenSum(int[] array, int size, int k){
        int windowSum = 0, count = 0;
        for(int i = 0; i < k; i++){
            windowSum += array[i];
        }
        if(windowSum % 2 == 0) count++;

        for(int i = k; i < size; i++){
            windowSum += array[i] - array[i - k];
            if(windowSum % 2 == 0) count++;
        }
        return count;
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
        System.out.println("the number of subarrays where the sum is an even number in every subarray of size K: ");
        int result = countSubarraysWithEvenSum(array, size, k);
        System.out.println(result);
        scan.close();
    }
}
