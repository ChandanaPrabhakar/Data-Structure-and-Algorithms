package Patterns;
import java.util.*;

public class DiagonalPatternII {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = scan.nextInt();
        for(int i = 0; i < rows ;i ++){
            for(int j = 0; j < rows; j++){
                if(j == i){
                    System.out.print("\\ ");
                }else if(j == rows - i - 1){
                    System.out.print("/ ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
