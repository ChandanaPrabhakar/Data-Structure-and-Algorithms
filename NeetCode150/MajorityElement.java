package NeetCode150;
import java.util.*;

public class MajorityElement {
    public static int majorityElement(int[] array, int size){
        int count = 0, candidate = 0;

        for(int number : array){
            if(count == 0){
                candidate = number;
            }
            count += (number == candidate) ? 1 : -1;
        }
        return candidate;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array element: ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Majority value: "+majorityElement(array, size));
        scan.close();
    }
}
