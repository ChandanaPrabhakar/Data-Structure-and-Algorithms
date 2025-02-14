package Algorithms.SearchingAlgorithms;
import java.util.*;

public class TernarySearchRecursive {
    public static int ternarySearchRecursive(int array[], int low, int high, int key){
        while(high >= low){
            int midPoint1 = low + (high - low) / 2;
            int midPoint2 = high - (high - low) / 2;

            if(array[midPoint1] == key){
                return midPoint1;
            }
            if(array[midPoint2] == key){
                return midPoint2;
            }

            if(key < array[midPoint1]){
                return ternarySearchRecursive(array, low, midPoint1 - 1, key);
            }else if(key > array[midPoint2]){
                return ternarySearchRecursive(array, midPoint2 + 1, high, key);
            }else if(key > array[midPoint1] && key < array[midPoint2]){
                return ternarySearchRecursive(array, midPoint1 + 1, midPoint2 - 1, key);
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
        System.out.println("Element found in index: "+ternarySearchRecursive(array, 0 , size - 1, key));
        scan.close();
    }
}
