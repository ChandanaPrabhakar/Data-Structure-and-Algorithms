package Patterns;
import java.util.*;

public class CharacterV {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scan.nextInt();

        for(int i = rows-1; i >= 0; i--){
            for(int j = rows-1; j > i; j--){
                System.out.print("  ");
            }
            System.out.print((char)( 65 + i));

            for(int j = 1; j < (2*i); j++){
                System.out.print("  ");
            }
            if(i >= 1){
                System.out.print((char) (65 + i));
            }

            System.out.println();
        }
        scan.close();
    }
    
}
