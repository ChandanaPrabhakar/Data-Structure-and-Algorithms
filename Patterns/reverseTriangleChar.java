package Patterns;
import java.util.*;

public class reverseTriangleChar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();
        for(int i = 0; i < rows; i++){
            char ch = (char)('A' + i);
            for(int j = i+1; j > 0; j--){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
        scan.close();
    }
}
