package NeetCode150;
import java.util.*;

public class ContainsDuplicate {
    public static boolean hasDuplicates(int[] array, int size){
        Set<Integer> entry = new HashSet<>();
        for(int number: array){
            if(entry.contains(number)){
                return true;
            }
            entry.add(number);
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("return true if any value appears more than once in the array, otherwise return false: "+hasDuplicates(array, size));
        scan.close();
    }
}
