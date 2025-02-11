package Arrays;
import java.util.*;

public class FindSecondMinimum {
    public static int secondSmallestElement(int[] array, int size){
        int minimum = Integer.MAX_VALUE;
        int secondMinimum = Integer.MAX_VALUE;
        for(int i = 0; i < size; i++){
            if(array[i] == minimum){
                secondMinimum = minimum;
            }else if(array[i] < minimum){
                secondMinimum = minimum;
                minimum = array[i];
            }else if(array[i] < secondMinimum){
                secondMinimum = array[i];
            }
        }
        return secondMinimum;
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
        System.out.println("Second minimum element in array: "+secondSmallestElement(array, size));
        scan.close();
    }
}
