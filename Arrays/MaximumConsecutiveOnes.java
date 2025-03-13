package Arrays;
import java.util.*;

public class MaximumConsecutiveOnes {
    public static int countMaxConsecutiveOne(int[] array, int size){
        if(size == 0) return 0;

        int count = 1, maximumCount = 0;
        for(int i = 1; i < size; i++){
            if(array[i] == array[i - 1]){
                count++;
            }else{
                maximumCount = Math.max(maximumCount, count);
                count = 1;
            }
        }
        return Math.max(maximumCount, count);
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
        System.out.println("maximum consecutive one's in array: "+countMaxConsecutiveOne(array, size));
        scan.close();
    }
}
