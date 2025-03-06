package Patterns;
import java.util.*;

public class Rhombus {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number  of rows: ");
        int rows = scan.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = rows - i - 1; j > 0 ; j--){
                System.out.print("  ");
            }
            for(int j = 0; j < rows; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }
}
