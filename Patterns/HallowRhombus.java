package Patterns;
import java.util.*;

public class HallowRhombus {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scan.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = rows - i - 1; j > 0; j--){
                System.out.print("  ");
            }
            for(int j = 0; j < rows; j++){
                if(i == 0 || j == 0 || j == rows - 1 || i == rows - 1){
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
