package Arrays;
import java.util.*;

public class NumSort {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Original Array: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted Array: "+ Arrays.toString(arr));
        scan.close();
    }
}
