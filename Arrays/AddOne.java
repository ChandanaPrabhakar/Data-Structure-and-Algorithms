package Arrays;
import java.util.*;

public class AddOne {
    public static void addOne(int[] array, int size){
        int carry = 1;
        for(int i = size - 1; i >= 0; i--){
            int sum = array[i] + carry;
            array[i] = sum % 10;
            carry = sum / 10;
        }
        if(carry > 0){
            int[] newArray = new int[size+1];
            newArray[0] = carry;
            System.arraycopy(array, 0, newArray, 1, size);
            System.out.println(Arrays.toString(newArray));
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        addOne(array, size);
        scan.close();
    }
}
