package SlidingWindow;
import java.util.*;

public class LongestBinarySubarray {
    public static int longestBinarySubarray(int[] array, int size){
        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 0, prefixSum = 0;

        map.put(0, -1);
        for(int right = 0; right < size; right++){
            prefixSum += (array[right] == 0) ? -1 : 1;

            if(map.containsKey(prefixSum)){
                maxLength = Math.max(maxLength, right - map.get(prefixSum));
            }else{
                map.put(prefixSum, right);
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
        System.out.println("the length of the longest binary subarray with equal `0s` and `1s`: ");
        int result = longestBinarySubarray(array, size);
        System.out.println(result);
        scan.close();
    }
}
