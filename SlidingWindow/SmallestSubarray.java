package SlidingWindow;
import java.util.*;

public class SmallestSubarray {
    public static int smallestSubarray(int[] array, int size, int x){
        int i = 0, j = 0;
        int result = Integer.MAX_VALUE;

        while (j < size) {
            int sum = 0;
            while(j < size && sum <= x){
                sum += array[j++];
            }

            if(j == size - 1 && sum <= x) break;

            while(i < j && sum - array[i] > x){
                sum -= array[i++];
            }
            result = Math.min(result, j - i);

            sum -= array[i++];
        }
        if(result == Integer.MAX_VALUE) return 0;
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
        System.out.println("Enter value of x: ");
        int x = scan.nextInt();
        System.out.println("the length of the smallest subarray with sum greater than or equal to x: "+smallestSubarray(array, size, x));
        scan.close();
    }
}
