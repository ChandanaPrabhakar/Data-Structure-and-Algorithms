package Recursion;
import java.util.*;

public class TailSumOfElements {
    public static int SumOfElementsTailedRec(int[] arr, int length, int sum){
        if(length == 0){
            return sum;
        }
        return SumOfElementsTailedRec(arr, length-1, sum+ arr[length-1]);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int length = scan.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(SumOfElementsTailedRec(arr, length, 0));
        scan.close();
    }
    
}
