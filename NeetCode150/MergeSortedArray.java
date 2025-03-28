package NeetCode150;
import java.util.*;

public class MergeSortedArray {
    public static int[] merge(int[] array1, int m, int[] array2, int n){
        int i = m - 1, j = n - 1, k = m + n - 1;
        while(i >= 0 && j >= 0){
            if(array1[i] > array2[j]){
                array1[k--] = array1[i--];
            }else{
                array1[k--] = array2[j--];
            }
        }

        while(j >= 0){
            array1[k--] = array2[j--];
        }
        return array1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sizes of array1 and array2: ");
        int size1 = scan.nextInt();
        int size2 = scan.nextInt();
        System.out.println("Enter array1 elements: ");
        int array1[] = new int[size1+ size2];
        for(int i = 0; i < size1; i++){
            array1[i] = scan.nextInt();
        }
        System.out.println("Enter array2 elements: ");
        int array2[] = new int[size2];
        for(int i = 0; i < size2; i++){
            array2[i] = scan.nextInt();
        }

        System.out.println("Merged sorted array: ");
        int[] result = merge(array1, size1, array2, size2);

        for(int number : result){
            System.out.print(number+" ");
        }
        scan.close();
    }
}
