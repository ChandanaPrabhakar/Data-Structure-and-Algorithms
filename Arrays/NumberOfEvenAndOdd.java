package Arrays;
import java.util.*;

public class NumberOfEvenAndOdd {
    public static void countEvenAndOdd(int[] array, int size){
        int oddCount =0, evenCount = 0;
        for(int i = 0; i < size; i++){
            if(array[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Number of even and odd elements in array: "+evenCount+" , "+oddCount);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int array[]= new int[size];
        for(int  i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        countEvenAndOdd(array, size);
        scan.close();
    }
}
