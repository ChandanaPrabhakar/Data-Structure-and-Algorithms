package Patterns;
import java.util.*;

public class HallowRectangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values of rows and columns: ");
        int rows = scan.nextInt();
        int columns = scan.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(i == 0 || j == 0 || j == columns - 1 || i == rows - 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
