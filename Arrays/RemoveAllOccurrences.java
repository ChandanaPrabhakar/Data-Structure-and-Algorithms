package Arrays;
import java.util.*;

public class RemoveAllOccurrences {
    public static void removeOccurrences(int[] array, int size, int element){
        int count = 0;
        for(int i = 0; i < size; i++){
            if(array[i] != element){
                array[count] = array[i];
                count++;
            }
        }
        System.out.println("The number of elements which are not equal to element: "+count);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter the element: ");
        int element = scan.nextInt();
        System.out.println("Enter array element: ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        removeOccurrences(array, size, element);
        scan.close();
    }
}
