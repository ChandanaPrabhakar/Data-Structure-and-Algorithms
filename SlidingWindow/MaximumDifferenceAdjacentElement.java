package SlidingWindow;
import java.util.*;

public class MaximumDifferenceAdjacentElement {
    public static List<Integer> difference(int[] array, int size, int k){
         List<Integer> result = new ArrayList<>();
         for(int i = 0; i < k; i++){
            result.add(Math.abs(array[i] - array[i+1]));
         }

         for(int i = k; i < size - 1; i = i + 2){
            result.add(Math.abs(array[i] - array[i + 1]));
         }
         return result;
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
        System.out.println("the maximum difference between any two adjacent elements in a subarray of size K: ");
        List<Integer> result = difference(array, size, k);
        System.out.println(result);
        scan.close();
    }
}
