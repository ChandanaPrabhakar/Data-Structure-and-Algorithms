package SlidingWindow;
import java.util.*;

public class MaximumProductOfAnySubarray {
    public static int maximumProduct(int[] array, int size, int k){
        int windowProduct = 1, maxProduct = Integer.MIN_VALUE;

        for(int i = 0; i < k; i++){
            windowProduct *= array[i];
        }

        maxProduct = Math.max(maxProduct, windowProduct);

        for(int i = k; i < size; i++){
            if(array[i] != 0){
                windowProduct = (windowProduct / array[i - k]) * array[i];
            }else{
                windowProduct = 1;
                for(int j = i - k + 1; j <= i; j++){
                    windowProduct *=  array[j];
                }
            }
            maxProduct = Math.max(maxProduct, windowProduct);
        }
        return maxProduct;
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
        System.out.println("the Maximum product of any contiguous subarray of size K: "+maximumProduct(array, size, k));
        scan.close();
    }
}
