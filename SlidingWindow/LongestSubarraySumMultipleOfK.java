package SlidingWindow;
import java.util.*;

public class LongestSubarraySumMultipleOfK {
    public static int longestSumMultipleK(int[] array, int size, int k){
        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 0, prefixSum = 0;
        
        map.put(0, -1);
        for(int right = 0; right < size; right++){
            prefixSum += array[right];
            int remainder = prefixSum % k;
            if(remainder < 0) remainder += k;

            if(map.containsKey(remainder)){
                maxLength = Math.max(maxLength, right - map.get(remainder));
            }else{
                map.put(remainder, right);
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
        System.out.println("Enter value of k: ");
        int k = scan.nextInt();
        System.out.println("the longest subarray whose sum is a multiple of `K`: ");
        int result = longestSumMultipleK(array, size, k);
        System.out.println(result);
        scan.close();
    }
}
