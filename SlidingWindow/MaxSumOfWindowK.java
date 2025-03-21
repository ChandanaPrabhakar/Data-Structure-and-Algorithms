package SlidingWindow;
import java.util.*;

public class MaxSumOfWindowK{
    public static int maxSum(int[] array, int size, int k){
        if(size <= k){
            return -1;
        }

        int sum = 0, maximumSum = 0;
        for(int i = 0; i < k; i++){
            sum += array[i];
        }

        for(int i = 1; i < size - k + 1; i++){
            int previousElement = array[i-1];
            int nextElement = array[i+k-1];
            sum += nextElement - previousElement;
            maximumSum = Math.max(maximumSum, sum);
        }
        return maximumSum;
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
        System.out.println("the maximum sum of all subarrays of size K: "+maxSum(array, size, k));
        scan.close();
    }
}