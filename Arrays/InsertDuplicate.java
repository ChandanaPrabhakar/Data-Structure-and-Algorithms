package Arrays;
import java.util.*;

public class InsertDuplicate {
    public static void insertAdjacentDuplicate(int[] array, int size, int k){
        int count = 0;
        for(int i = 0; i < size; i++){
            if(array[i] == k){
                count++;
            }
        }
        int writeIndex = size + count - 1, current = size - 1;

        while(current >= 0 && writeIndex >= 0){
            if(writeIndex < size){
                array[writeIndex] = array[current];
            }
            writeIndex -= 1;

            if(array[current] == k){
                if(writeIndex < size){
                    array[writeIndex] = k;
                }
                writeIndex -= 1;
            }
            --current;
        }
        System.out.println("modified array: "+Arrays.toString(array));

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter the value of k: ");
        int k = scan.nextInt();
        System.out.println("Enter array elements: ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i]= scan.nextInt();
        }
        insertAdjacentDuplicate(array, size, k);
        scan.close();
    }
}
