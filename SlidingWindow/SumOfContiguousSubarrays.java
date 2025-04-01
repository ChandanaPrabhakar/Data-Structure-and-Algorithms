package SlidingWindow;
import java.util.*;

public class SumOfContiguousSubarrays {
    public static List<Integer> sumOfContiguousSubarrays(int[] array, int size, int k){
        List<Integer> result = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += array[i];
        }

        result.add(sum);

        for(int i = k; i < size; i++){
            sum += array[i] - array[i - k];
            result.add(sum);
        }

        return result;
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
        System.out.println("Sum of contiguous subarrays of size k: ");
        List<Integer> result = sumOfContiguousSubarrays(array, size, k);
        System.out.println(result);
        scan.close();
    }
}
