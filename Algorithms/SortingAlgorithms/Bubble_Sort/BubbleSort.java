package Algorithms.SortingAlgorithms.Bubble_Sort;
import java.util.*;

public class BubbleSort {

    static void bubbleSort(int arr[], int n){
        
        for(int i =0; i<n-1; i++){
            int temp;
            boolean swapped = false;

            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }
            if(swapped == false)
                break;
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        bubbleSort(arr, n);
        in.close();

        for(int index=0; index < n; index++){
            System.out.print(arr[index]+" ");
        }
    }
}
