package Arrays;
import java.util.*;

public class ArrayAverage {
    public static float AverageArray(int arr[], int size){
        if(size == 1){
            return (float)arr[size-1];
        }
        return (float)(AverageArray(arr, size-1) * (size-1) + arr[size-1]) / size;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Average of arrays elements: "+ AverageArray(arr, size));
        scan.close();
    }
}
