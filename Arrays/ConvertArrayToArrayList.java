package Arrays;
import java.util.*;

public class ConvertArrayToArrayList {
    public static ArrayList<Integer> convertToArrayList(int array[], int size){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < size; i++){
            list.add(array[i]);
        }
        return list;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int array[] = new int[size];
        for(int i = 0; i< size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Array: "+ Arrays.toString(array));
        System.out.println("Array List: "+ convertToArrayList(array, size));
        scan.close();
    }
}
