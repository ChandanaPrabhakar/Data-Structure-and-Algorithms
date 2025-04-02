package SlidingWindow;
import java.util.*;

public class LongestSubarrayOfUniqueElements {
    public static int longestSubarrayUniqueElements(int[] array, int size){
        Set<Integer> set = new HashSet<>();
        int maxLength = 0, left = 0;

        for(int right = 0; right < size; right++){
            if(set.contains(array[right])){
                set.remove(array[left]);
                left++;
            }
            set.add(array[right]);
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
        System.out.println("the longest subarray where all elements are unique: ");
        int result = longestSubarrayUniqueElements(array, size);
        System.out.println(result);
        scan.close();
    }
}
