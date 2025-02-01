package Arrays;
import java.util.*;

public class CountDuplicateStringElements {
    public static void countDuplicate(String array[] , int size){
        int count = 0;
        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
                if(array[i].equals(array[j])){
                    if(i != j){
                        count++;
                    }
                }
            }
        }
        System.out.println("Number of duplicate elements: "+count);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements(String): ");
        String array[] = new String[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.next();
        }
        countDuplicate(array, size);
        scan.close();
    }
}
