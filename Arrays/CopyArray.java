package Arrays;
import java.util.*;

public class CopyArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int array[] = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Array 1: "+Arrays.toString(array));
        int array2[] = new int[size];
        for(int i = 0; i < size; i++){
            array2[i] = array[i];
        }
        System.out.println("copied array: "+Arrays.toString(array2));
        scan.close();
    }
}
