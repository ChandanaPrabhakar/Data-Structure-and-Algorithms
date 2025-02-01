package Arrays;
import java.util.*;

public class CommonElement {
    public static void commonElement(int array1[],int array2[], int size){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(array1[i] == array2[j]){
                    System.out.println("Common array element: "+array1[i]);
                }
            }
        }
        System.out.println("No common elements");
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();
        System.out.println("Enter first array elements: ");
        int array1[] = new int[size];
        int array2[] = new int[size];
        for(int i = 0; i < size; i++){
            array1[i] = scan.nextInt();
        }
        System.out.println("Enter second array elements: ");
        for(int i = 0; i < size; i++){
            array2[i] = scan.nextInt();
        }
        commonElement(array1, array2, size);
        scan.close();
    }
}
