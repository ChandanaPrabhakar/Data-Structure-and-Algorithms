package Patterns;
import java.util.*;

public class PyramidNum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scan.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < rows-i-1; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i+1; j++){
                System.out.print(j+" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
