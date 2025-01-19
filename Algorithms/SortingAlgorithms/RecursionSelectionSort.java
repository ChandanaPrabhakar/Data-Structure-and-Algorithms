package Algorithms.SortingAlgorithms;
import java.util.*;

public class RecursionSelectionSort {

    static int mini_index(int arr[], int i, int j){
        if(i == j){
            return i;
        }

        int k = mini_index(arr, i+1, j);

        return (arr[i] < arr[k] ? i : k);
    }

    static void RecurSelectionSort(int arr[], int n, int min_idx){

        if(min_idx == n){
            return;
        }
        int k = mini_index( arr, min_idx, n-1);
        if( k != min_idx){
            int temp = arr[k];
            arr[k] = arr[min_idx];
            arr[min_idx] = temp; 
        }

        RecurSelectionSort(arr, n, min_idx + 1);

        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        RecurSelectionSort(arr, n, 0);

        for(int index=0; index < n; index++){
            System.out.print(arr[index]+" ");
        }

        in.close();
    }
}
