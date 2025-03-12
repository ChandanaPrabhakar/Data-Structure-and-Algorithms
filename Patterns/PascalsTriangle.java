package Patterns;
import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = scan.nextInt();


        for (int i = 1; i <= rows; i++) {
            for(int j = rows - i; j > 0; j--){
                System.out.print(" ");
            }
            int c = 1; 
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c = c * (i - j) / j;
            }
            System.out.println();
        }
        scan.close();
    }
}
