package Patterns;
import java.util.*;

public class DiagonalPatternI {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = rows - i; j > 0; j--){
                System.out.print("* ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("  ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("  ");
            }
            for(int j = rows - i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = rows - i - 1 ; j > 0; j--){
                System.out.print("  ");
            }
            for(int j = rows - i - 1; j > 0; j--){
                System.out.print("  ");
            }
            for(int j = 0 ; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }
}
