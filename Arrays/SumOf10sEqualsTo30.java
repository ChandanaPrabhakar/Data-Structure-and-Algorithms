package Arrays;
import java.util.*;

public class SumOf10sEqualsTo30 {
    public static boolean sumOfTens(int[] array, int size){
        int sum = 0;
        for(int i = 0; i < size; i++){
            if(array[i] == 10){
                sum += array[i];
            }
        }
        if(sum == 30){
            return true;
        }else{
            return false;
        }
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
        System.out.println("Is sum of 10s equal to 30: "+sumOfTens(array, size));
        scan.close();
    }
}
