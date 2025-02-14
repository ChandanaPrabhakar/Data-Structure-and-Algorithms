package Algorithms.SearchingAlgorithms;
import java.util.*;

public class TernarySearchIterative {
    public static int ternarySearchIterative(int array[], int size, int key){
        int low = 0, high = size - 1;
        while(low <= high){
            int midPoint1 = low + (high - low) / 2;
            int midPoint2 = high - (high - low) / 2;
            if(array[midPoint1] == key){
                return midPoint1;
            }
            if(array[midPoint2] == key){
                return midPoint2;
            }

            if(key < array[midPoint1]){
                high = midPoint1 - 1;
            }else if(key > array[midPoint2]){
                low = midPoint2 + 1;
            }else if(key > array[midPoint1] && key < array[midPoint2]){
                low = midPoint1 + 1;
                high = midPoint2 - 1;
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
        for(int i = 0; i< size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Enter key elements: ");
        int key = scan.nextInt();
        System.out.println("Element found at index: "+ternarySearchIterative(array, size, key));
        scan.close();
    }
}
