package NeetCode150;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void rotateArray(int[] array, int size, int k){
        k %= array.length;
        reverse(array, 0, size - 1);
        reverse(array, 0, k - 1);
        reverse(array, k, size - 1);
    }

    public static void reverse(int[] array, int start, int end){
        while(start < end){
            int temporaryVariable = array[start];
            array[start] = array[end];
            array[end] = temporaryVariable;
            start++;
            end--;
        }
    }

    public static void printMatrix(int[] matrix) {
        System.out.println(Arrays.toString(matrix));
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Enter value of K: ");
        int k = scan.nextInt();
        System.out.println("\nOriginal Matrix:");
        printMatrix(array);

        rotateArray(array, size, k);

        System.out.println("\nRotated Matrix:");
        printMatrix(array);
        scan.close();
    }
}
