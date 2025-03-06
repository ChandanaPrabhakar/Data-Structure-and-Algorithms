package Patterns;
import java.util.*;

public class ArrowPattern {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scan.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < i ; j++){
                System.out.print("  ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = rows; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("  ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }
}
