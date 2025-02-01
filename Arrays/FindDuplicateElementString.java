package Arrays;
import java.util.*;

public class FindDuplicateElementString {
    public static void findDuplicateStrings(String array[], int size){
        String duplicate = "";
        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
                if((array[i].equals(array[j]) && (i != j))){
                    duplicate = array[i];
                    System.out.println("Duplicate element(String): "+duplicate);
                }
            }
        }
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
        findDuplicateStrings(array, size);
        scan.close();
    }
}
