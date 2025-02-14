package Arrays;
import java.util.*;

public class FirstRepeatingElement {
    public static int firstRepeatingElement(int array[], int size){
        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
                if(array[i] == array[j]){
                    return array[i];
                }
            }
        }
        return -1;
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
        System.out.println("First repeating element: "+firstRepeatingElement(array, size));
        scan.close();
    }
}
