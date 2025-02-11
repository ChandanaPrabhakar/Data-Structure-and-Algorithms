package Arrays;
import java.util.*;

public class ArrayAverageExcludingLargestSmallest {
    public static float averageOfArrayExcludingLargestAndSmallest(int array[], int size){
        int largestElement = Integer.MIN_VALUE;
        int smallestElement = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < size; i++){
            if(array[i] > largestElement){
                largestElement = array[i];
            }
            if(array[i] < smallestElement){
                smallestElement = array[i];
            }
            sum += array[i];
        }
        return (float)(sum - largestElement-smallestElement) / (size - 2);
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
        System.out.println("Average of array excluding largest and smallest element: "+averageOfArrayExcludingLargestAndSmallest(array, size));
        scan.close();
    }
}
