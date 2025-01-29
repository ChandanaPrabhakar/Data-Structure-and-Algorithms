package Patterns;
import java.util.*;

public class reverseTriangleNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scan.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = i+1; j > 0; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
