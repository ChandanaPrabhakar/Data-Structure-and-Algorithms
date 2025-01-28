package Arrays;
import java.util.*;

public class StringSort {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int size = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Array elements: ");
        String str[] = new String[size];
        for(int i = 0; i < size; i++){
            str[i] = scan.nextLine();
        }
        System.out.println("Original String Array: "+ Arrays.toString(str));
        Arrays.sort(str);
        System.out.println("Sorted String Array: "+Arrays.toString(str));
        scan.close();
    }
}
