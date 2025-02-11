package Arrays;
import java.util.*;

public class DifferenceLargestSmallest {
    public static int differenceOfLargestAndSmallest(int[] array, int size){
        int largestElement = Integer.MIN_VALUE;
        int smallestElement = Integer.MAX_VALUE;
        for(int i = 0; i < size; i++){
            if(array[i] > largestElement){
                largestElement = array[i];
            }
            if(array[i] < smallestElement){
                smallestElement = array[i];
            }
        }
        return largestElement - smallestElement;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int array[] = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Difference of largest and smallest element in array: "+differenceOfLargestAndSmallest(array, size));
        scan.close();
    }
}
