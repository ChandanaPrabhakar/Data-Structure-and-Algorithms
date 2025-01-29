package Patterns;
import java.util.*;

public class TrianglePatternNum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbre of rows: ");
        int rows = scan.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
