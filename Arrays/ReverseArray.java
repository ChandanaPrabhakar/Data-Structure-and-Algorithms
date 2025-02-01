package Arrays;
import java.util.*; 

import java.util.Scanner;

public class ReverseArray {
    public static void reverseArray(int array[], int size){
        int array1[] = new int[size];
        for(int i = 0; i < size; i++){
            int temp = array[i];
            array1[i] = array[size - i - 1];
            array1[size - i - 1] = temp;
        }
        System.out.println("Reverse of array: "+ Arrays.toString(array1));
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Original Array: "+ Arrays.toString(array));
        reverseArray(array, size);
        scan.close();
    }
}
