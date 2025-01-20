package Algorithms.SortingAlgorithms.Selection_Sort;
import java.util.*;

public class StringSelectionSort {

    static void stringSelectionSort(String arr[], int n){
        for(int i = 0; i < n-1; i++){
            int mini_index = i;
            String mini_string = arr[mini_index];
            for(int j= i+1; j<n; j++){
                if(arr[j].compareTo(mini_string) < 0){
                    mini_index = j;
                    mini_string = arr[j];
                }
            }

            if(mini_index != i){
                String temp = arr[mini_index];
                arr[mini_index] = arr[i];
                arr[i] = temp;
            }    
        }
        for(int index=0; index < n; index++){
            System.out.print(arr[index]+" ");
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = in.nextInt();
        String arr[] = new String[n];
        for(int i =0; i<n; i++){
            arr[i] = in.next();
        }
        stringSelectionSort(arr , n);
        in.close();
    }
}
