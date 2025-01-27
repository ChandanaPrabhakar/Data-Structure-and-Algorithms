package Recursion.Easy;
import java.util.*;

public class SumOfArr {
    public static int SumOfArrayElements(int arr[], int length){
        if(length == 1 ){
            return arr[length-1];
        }
        return arr[length-1] + SumOfArrayElements(arr, length-1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int length = scan.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[length];
        for(int i=0; i <length; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(SumOfArrayElements(arr, length));
        scan.close();
    }
    
}
