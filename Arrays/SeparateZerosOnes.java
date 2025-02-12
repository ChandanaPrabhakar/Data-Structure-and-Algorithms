package Arrays;
import java.util.*;

public class SeparateZerosOnes {
    public static void separateZerosAndOnes(int[] array, int size){
        int j = 0;
        for(int i = 0; i < size; i++){
            if(array[i] != 1){
                int temporaryVariable = array[i];
                array[i] = array[j];
                array[j] = temporaryVariable;
                j++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int array[] = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        separateZerosAndOnes(array, size);
        scan.close();
    }
}
