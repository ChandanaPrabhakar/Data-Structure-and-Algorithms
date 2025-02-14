package Algorithms.SearchingAlgorithms;
import java.util.Scanner;

public class BinarySearchIteratives {
    public static int binarySearchIterative(int[] array, int size, int key){
        int low = 0, high = size -1;
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
        System.out.println("Key is found in index: "+binarySearchIterative(array,size,key));
        scan.close();
    }
}
