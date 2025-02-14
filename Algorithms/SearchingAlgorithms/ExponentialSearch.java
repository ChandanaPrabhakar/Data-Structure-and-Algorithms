package Algorithms.SearchingAlgorithms;
import java.util.*;

public class ExponentialSearch {
    public static int binarySearch(int array[], int low, int high, int key){
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(key < array[mid]){
                high = mid - 1;
            }else if(key > array[mid]){
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static int exponentialSearch(int array[], int size, int key){
        if(array[0] == key){
            return 0;
        }
        int i = 1;
        while(i < size && array[i] <= key){
            i *= 2;
        }
        return binarySearch(array, i/2, size - 1, key);
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
        System.out.println("Enter key: ");
        int key = scan.nextInt();
        System.out.println("Key is found in index: "+exponentialSearch(array,size,key));
        scan.close();
    }
}
