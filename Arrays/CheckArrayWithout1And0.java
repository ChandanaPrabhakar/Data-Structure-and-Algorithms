package Arrays;
import java.util.*;

public class CheckArrayWithout1And0 {
    public static boolean arrayIsWithout1sAnd0s(int array[], int size){
        for(int i = 0; i < size; i++){
            if(array[i] == 0 || array[i] == -1){
                return false;
            }
        }
        return true;
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
        System.out.println("Array is without 1s and 0s: "+arrayIsWithout1sAnd0s(array, size));
        scan.close();
    }
}
