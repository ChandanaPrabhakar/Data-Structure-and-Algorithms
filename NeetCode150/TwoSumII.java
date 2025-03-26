package NeetCode150;
import java.util.*;

public class TwoSumII {
    public static int[] twoSumII(int[] array, int size, int target){
        int start = 0, end = size - 1;
        while(start < end){
            if(array[start] + array[end] == target){
                return new int[]{start+1 , end+1};
            }else if( array[start] + array[end] > target){
                end--;
            }else{
                start++;
            }
        }
        return new int[]{};
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
        System.out.println("Enter target value: ");
        int target = scan.nextInt();
        int[] result = twoSumII(array, size, target);

        if (result.length == 2) {
            System.out.println("Indices: " + Arrays.toString(result));
        } else {
                System.out.println("No solution found.");
        }
        scan.close();
    }
}
