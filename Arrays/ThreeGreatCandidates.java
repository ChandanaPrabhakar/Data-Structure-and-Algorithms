package Arrays;
import java.util.*;

public class ThreeGreatCandidates {
    public static int maxProduct(int[] array, int size){
        int firstLargest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE, thirdLargest = Integer.MIN_VALUE, firstSmallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

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
            
            if(array[i] < firstSmallest){
                secondSmallest = firstSmallest;
                firstSmallest = array[i];
            }else if(array[i] < secondSmallest){
                secondSmallest = array[i];
            }
        }
        return Math.max(firstLargest * secondLargest * thirdLargest, firstSmallest * secondSmallest * firstLargest);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Maximum product of a triplet (subsequence of size 3) in array: "+maxProduct(array, size));
        scan.close();
    }
}
