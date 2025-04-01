package SlidingWindow;
import java.util.*;

public class NumberOfSubarraysExactlyEqualToSum {
    public static int countSubarrayEqualToSum(int[] array, int size, int k){
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        int prefixSum = 0, count = 0;

        prefixSumMap.put(0, 1);

        for(int number: array){
            prefixSum += number;

            if(prefixSumMap.containsKey(prefixSum - k)){
                count += prefixSumMap.get(prefixSum - k);
            }

            prefixSumMap.put(prefixSum, prefixSumMap.getOrDefault(prefixSum, 0)+1);
        }

        return count;
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
        System.out.println("Number of subarrays with sum exactly K: ");
        int result = countSubarrayEqualToSum(array, size, k);
        System.out.println(result);
        scan.close();
    }
}
