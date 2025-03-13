package Arrays;
import java.util.*;

public class ArrayWave {
    public static void swap(int[] array, int start, int end){
        int temporaryVariable = array[start];
        array[start] = array[end];
        array[end] = temporaryVariable;
    }
    public static void sortArrayWave(int[] array, int size){
        for(int i = 1; i < size; i+=2){
            if(i > 0 && array[i - 1] > array[i]){
                swap(array, i - 1, i);
                if(i < size - 1 && array[i + 1] > array[i]){
                    swap(array, i, i -1);
                }
            }
        }
        System.out.println(Arrays.toString(array));
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
        System.out.println("sorted array in wave form: ");
        sortArrayWave(array, size);
        scan.close();
    }
}
