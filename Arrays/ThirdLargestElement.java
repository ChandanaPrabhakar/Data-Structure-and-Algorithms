package Arrays;
import java.util.*;

public class ThirdLargestElement {
    public static int thirstLargest(int[] array, int size){
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        for(int i = 0; i < size; i++){
            if(array[i] > firstLargest){
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = array[i];
            }else if(array[i] > secondLargest){
                thirdLargest = secondLargest;
                secondLargest = array[i];
            }else if(array[i] > thirdLargest){
                thirdLargest = array[i];
            }
        }
        return thirdLargest;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int[] array = new int[size];
        for(int i = 0; i< size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Third largest element in an array: "+thirstLargest(array, size));
        scan.close();
    }
}
