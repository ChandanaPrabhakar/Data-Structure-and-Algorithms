package Algorithms.SortingAlgorithms.Merge_Sort;
import java.util.*;

public class MergeSort {
    public static void merge(int[] array, int low, int mid, int high){
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int [] leftArray = new int [n1];
        int [] rightArray = new int [n2];

        for(int i = 0; i < n1; i++) leftArray[i] = array[low + i];
        for(int j = 0; j < n2; j++) rightArray[j] = array[mid + 1 + j];

        int i = 0, j = 0, k = low;
        while(i < n1 && j < n2){
            if(leftArray[i] <= rightArray[j]){
                array[k++] = leftArray[i++];
            }else{
                array[k++] = rightArray[j++];
            }
        }

        while(i < n1) array[k++] = leftArray[i++];
        while(j < n2) array[k++] = rightArray[j++];
    }
    public static void mergeSort(int[] array, int low, int high){
        if(low < high){
            int mid = low + (high - low) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid+1, high);
            merge(array, low, mid, high);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int array[] = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        mergeSort(array, 0, size - 1);
        for(int i = 0; i < size; i++){
            System.out.print(array[i]+" ");
        }
        scan.close();
    }
}
