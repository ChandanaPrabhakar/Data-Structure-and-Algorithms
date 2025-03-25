package NeetCode150;
import java.util.*;

public class ProductOfArrayExceptSelf {
    public static String product(int[] array, int size){
        
        int result[] = new int[size]; 
        int prefix = 1, postfix = 1;
        Arrays.fill(result, 1);

        for(int i = 0; i < size; i++){
            result[i] = prefix;
            prefix *= array[i];
        }

        for(int i = size - 1; i >= 0; i--){
            result[i] *= postfix;
            postfix *= array[i];
        }

        return Arrays.toString(result);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Product of array except self: "+product(array, size));
        scan.close();
    }
}
