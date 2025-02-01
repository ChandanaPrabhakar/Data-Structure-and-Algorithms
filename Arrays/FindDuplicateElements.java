package Arrays;
import java.util.*;

public class FindDuplicateElements {
    public static void findDuplicates(int array[], int size){
        int duplicate = 0;
        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
                if(array[i] == array[j] && i != j){
                    duplicate = array[i];
                    System.out.println("Duplicate elements: "+ duplicate);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int array[] = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        findDuplicates(array, size);
        scan.close();
    }
}
