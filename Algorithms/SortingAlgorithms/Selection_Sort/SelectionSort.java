package Algorithms.SortingAlgorithms.Selection_Sort;
import java.util.*;

class SelectionSort{

    static void selectionSort(int arr[], int n){
        for(int i=0; i<n-1; i++){
            int mini_index = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[mini_index]){
                    mini_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini_index];
            arr[mini_index] = temp;
        }

        for(int index=0; index < n; index++){
            System.out.print(arr[index]+" ");
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = in.nextInt();
        }
        selectionSort(arr, n);
        in.close();
    }
}