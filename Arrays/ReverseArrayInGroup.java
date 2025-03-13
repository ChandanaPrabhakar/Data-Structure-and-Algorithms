package Arrays;
import java.util.*;

public class ReverseArrayInGroup {
    public static void reverseArrayGroup(int[] array, int group, int size){
        
        for(int i = 0; i < size; i+= group){
            int start = i, end = Math.min(i + group - 1, size - 1);
            while (start < end) {
                int temporaryVariable = array[end];
                array[end] = array[start];
                array[start] = temporaryVariable;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter the size of group: ");
        int group = scan.nextInt();
        System.out.println("Enter array elements: ");
        int [] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Reverse the array in given k groups: ");
        reverseArrayGroup(array, group, size);
        scan.close();
    }
}
