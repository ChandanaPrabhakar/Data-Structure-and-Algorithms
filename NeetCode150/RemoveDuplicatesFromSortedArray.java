package NeetCode150;
import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] array, int size){
        if(size == 0) return 0;
        int k = 1;
        for(int i = 1; i < size; i++){
            if(array[i] != array[i - 1]){
                array[k++] = array[i];
            }
        }
        return k;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array element: ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Removed value: "+removeDuplicates(array, size));
        scan.close();
    }
}
