package Arrays;
import java.util.*;

public class PrintGrid {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();
        int arr[][] = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.printf("%2d", arr[i][j] );
            }
            System.out.println();
        }
        scan.close();
    }
}
