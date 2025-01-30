package Arrays;
import java.util.*;

public class ValueCheck {
    public static boolean CheckValue(int arr[], int size, int key){
        for(int i = 0; i < size; i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the key value: ");
        int key = scan.nextInt();
        System.out.println("Enter size of array: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(CheckValue(arr, size, key));
        scan.close();
    }
}
