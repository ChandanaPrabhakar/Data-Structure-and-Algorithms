package Basic_Problems;
import java.util.*;

public class MergeTwoSortedArray {
    public static void mergeTwoSortedArrays(int[] array1, int size1, int[] array2, int size2){
        int i = 0, j = 0, k = 0;
        int [] mergedArray = new int[size1+size2];
        while(i < size1 && j < size2){
            if(array1[i] < array2[j]){
                mergedArray[k++] = array1[i++];
            }else{
                mergedArray[k++] = array2[j++];
            }
        }

        if(i < size1){
            mergedArray[k++] = array1[i++];
        }

        if(j < size2){
            mergedArray[k++] = array2[j++];
        }

        System.out.println("Merged sorted array: "+ Arrays.toString(mergedArray)); 
    }

    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the size of array 1: ");
        int size1 = scan.nextInt();
        System.out.println("Enter array 1 elements: ");
        int array1 [] = new int[size1];
        for(int i = 0; i < size1; i++){
            array1[i] = scan.nextInt();
        }
        System.out.println("Enter the size of array 2: ");
        int size2 = scan.nextInt();
        System.out.println("Enter array 2 elements: ");
        int array2 [] = new int[size2];
        for(int i = 0; i < size2; i++){
            array2[i] = scan.nextInt();
        }

        mergeTwoSortedArrays(array1, size1, array2, size2);

        scan.close();;
    }
}
