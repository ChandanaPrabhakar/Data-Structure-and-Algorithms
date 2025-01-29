package Patterns;
import java.util.*;

public class TrianglePatternRowChar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scan.nextInt();
        for(int i = 0; i < rows; i++){
            char ch = 'A';
            for(int j = i+1; j > 0; j--){
                ch = (char)(ch + i);
                System.out.print(ch);
                ch = (char)(ch - i);
            }
            System.out.println();
        }
        scan.close();
    }
}
