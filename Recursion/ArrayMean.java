package Recursion;
import java.util.*;

public class ArrayMean {
    public static float MeanOfArray(int arr[], int length){
        if(length == 1){
            return (float)(arr[length-1]);
        }
        else{
            return ((float)(MeanOfArray(arr, length - 1) * (length - 1) + arr[length - 1]) / length);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of an array: ");
        int length = scan.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter elements of array");
        for(int i=0; i<length; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(MeanOfArray(arr, length));
        scan.close();
    }
}
