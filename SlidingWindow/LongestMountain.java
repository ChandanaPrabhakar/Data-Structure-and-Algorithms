package SlidingWindow;
import java.util.*;

public class LongestMountain {
    public static int longestMountainInArray(int[] array, int size){
        int maxLength = 0;
        for(int i = 1; i < size - 1; i++){
            int right = i, left = i;

            if(array[i - 1] < array[i] && array[i] > array[i + 1]){
                while(left > 0 && array[left - 1] < array[left]) left--;
                while(right < size && array[right] > array[right + 1]) right++;
                maxLength = Math.max(maxLength, right - left + 1);
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
        System.out.println("the longest mountain in an array: ");
        int result = longestMountainInArray(array, size);
        System.out.println(result);
        scan.close();
    }
}
