package Arrays;
import java.util.*;

public class FindIndex {
    public static int FindKeyIndex(int arr[], int size, int key){
        for(int i = 0; i < size; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] rags){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the key: ");
        int key = scan.nextInt();
        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Key index: "+ FindKeyIndex(arr, size, key));
        scan.close();
    }
}
