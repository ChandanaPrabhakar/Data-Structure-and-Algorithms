package Arrays;
import java.util.*;

public class ArraySum {
    public static int SumArray(int[] arr, int size){
        if(size == 1){
            return arr[size-1];
        }
        return arr[size-1] + SumArray(arr, size-1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int size = scan.nextInt();
        System.out.println("Enter Array elements: ");
        int arr[] = new int[size];
        for(int i =0; i< size; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("The sum of values of array: "+ SumArray(arr, size));
        scan.close();
    }
}
