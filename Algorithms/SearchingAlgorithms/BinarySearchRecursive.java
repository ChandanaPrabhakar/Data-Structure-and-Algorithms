package Algorithms.SearchingAlgorithms;
import java.util.*;

public class BinarySearchRecursive {
    public static int binarySearchResursive(int[] array, int low, int high, int key){
        while(high >= low){
            int mid = low + (high - low) / 2;
            if(key < array[mid]){
                return binarySearchResursive(array, low, mid - 1, key);
            }else if(key > array[mid]){
                return binarySearchResursive(array, mid + 1, high, key);
            }else{
                return mid;
            }
        }
        return -1;
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
        System.out.println("Enter key element: ");
        int key = scan.nextInt();
        System.out.println("Element found at index: "+binarySearchResursive(array, 0, size - 1, key));
        scan.close();
    }
}
