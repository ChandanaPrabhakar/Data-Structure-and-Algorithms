package Patterns;
import java.util.*;

public class ReverseCharacterBridge {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scan.nextInt();

        for(int i = rows; i > 0; i--){
            char ch = 'A';
            for(int j = i; j > 0; j--){
                System.out.print(ch+" ");
                ch = (char) (ch + 1);
            }
            for(int j = 0; j < rows - i; j++){
                System.out.print("  ");
            }
            
            for(int j = 0 ; j < rows - i - 1; j++){
                if(i <= rows - 2){
                    System.out.print("  ");
                }
            }
            if(i == rows){
                ch = (char)(ch - 2);
                for(int j = i; j > 1; j--){
                    System.out.print(ch+" ");
                    ch--;
                }
            }
            if( i < rows){
                ch--;
                for(int j = i; j > 0; j--){
                    System.out.print(ch+" ");
                    ch--;
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
