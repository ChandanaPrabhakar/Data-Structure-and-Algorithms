package Patterns;
import java.util.*;

public class FloydsTriangleChar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scan.nextInt();
        char ch = 'A';
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print(ch+" ");
                ch = (char)(ch+1);
            }
            System.out.println();
        }
        scan.close();
    }
}
