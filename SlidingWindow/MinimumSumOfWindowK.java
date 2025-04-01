package SlidingWindow;
import java.util.*;

public class MinimumSumOfWindowK {
    public static int minimumSum(int[] array, int size, int k){
        int minimumSum = Integer.MAX_VALUE, windowSum = 0;

        for(int i = 0; i < k; i++){
            windowSum += array[i];
        }

        minimumSum = Math.min(minimumSum, windowSum);

        for(int i = k; i < size; i++){
            windowSum += array[i] - array[i - k];
            minimumSum = Math.min(minimumSum, windowSum);
        }

        return minimumSum;
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
        System.out.println("the minimum sum of all subarrays of size K: "+minimumSum(array, size, k));
        scan.close();
    }
}
