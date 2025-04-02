package SlidingWindow;
import java.util.*;

public class CountEvenInEverySubarray {
    public static List<Integer> countEven(int[] array, int size, int k){
        List<Integer> result = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < k; i++){
            if(array[i] % 2 == 0){
                count++;
            }
        }
        result.add(count);

        for(int i = k; i < size; i++){
            if(array[i - k] % 2 == 0){
                count--;
            }
            if(array[i] % 2 == 0) count++;

            result.add(count);
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
        System.out.println("the count of even numbers in every subarray of size K: ");
        List<Integer> result = countEven(array, size, k);
        System.out.println(result);
        scan.close();
    }
}
