package Patterns;
import java.util.*;

public class InvertedTriangleOfChar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scan.nextInt();
        for(int i = 0; i < rows; i++){
            char ch = 'A';
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < rows-i; j++){
                System.out.print(ch);
                ch = (char)(ch+1);
            }
            System.out.println();
        }
        scan.close();
    }
}
