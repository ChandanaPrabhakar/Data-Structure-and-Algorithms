package Arrays;
import java.util.*;

public class FindSecondLargest {
    public static int secondLargestElement(int[] array, int size){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < size; i++){
            if(array[i] == largest){
                secondLargest = largest;
            }else if(array[i] > largest){
                secondLargest = largest;
                largest = array[i];
            }else if(array[i] > secondLargest){
                secondLargest = array[i];
            }
        }
        return secondLargest;
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
        System.out.println("Second largest element in array: "+secondLargestElement(array, size));
        scan.close();
    }
}
