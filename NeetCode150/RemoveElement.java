package NeetCode150;
import java.util.*;

public class RemoveElement {
    public static int removeElement(int[] array, int size, int target){
        int k = 0;
        for(int i = 0; i < size; i++){
            if(array[i] != target){
                array[k++] = array[i];
            }
        }
        return k;
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
        System.out.println("Enter target value: ");
        int target = scan.nextInt();
        System.out.println("Removed value: "+removeElement(array, size, target));
        scan.close();
    }
}
