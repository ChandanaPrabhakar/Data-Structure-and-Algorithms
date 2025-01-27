package Recursion.Easy;
import java.util.*;

public class FindMinElement {
    public static int FindMinElementOfArray(int arr[], int length){
        if(length == 1){
            return arr[length-1];
        }
        return Math.min(arr[length-1], FindMinElementOfArray(arr, length-1));
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = scan.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(FindMinElementOfArray(arr, length));
        scan.close();
    }
}
