package Arrays;
import java.util.*;

public class RemoveDuplicates {
    public static int removeDuplicate(int[] array, int size){
        int index = 1;
        for(int i = 1; i < size; i++){
            if(array[i] != array[i-1]){
                array[index++] = array[i];
            }
        }
        return index;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        int newSize = removeDuplicate(array, size);
        System.out.println("New distinct array: ");
        for(int i = 0; i < newSize; i++){
            System.out.print(array[i]+" ");
        }
        scan.close();
    }
}
