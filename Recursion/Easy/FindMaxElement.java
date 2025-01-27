package Recursion.Easy;
import java.util.*;

public class FindMaxElement {
    public static int FindMaxElementOfArray(int arr[], int length){
        if(length == 1){
            return arr[length-1];
        }
        return Math.max(arr[length-1], FindMaxElementOfArray(arr, length-1));
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int length = scan.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(FindMaxElementOfArray(arr, length));
        scan.close();
    }
}
