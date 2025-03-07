package Patterns;
import java.util.*;

public class InvertedV {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");

        int rows = scan.nextInt();
        int k = 0;

        for(int i = rows-1; i >= 0; i--){
            for(int j = rows-1; j > k; j--){
                System.out.print("  ");
            }

            System.out.print((char)(i + 65));

            for(int j = 1; j < (2*k); j++){
                System.out.print("  ");
            }

            if(i < rows - 1){
                System.out.print((char)(65 + i));
            }
            System.out.println();
            k++;
        }
        scan.close();
    }
}
