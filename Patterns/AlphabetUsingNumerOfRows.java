package Patterns;
import java.util.*;

public class AlphabetUsingNumerOfRows {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j <= rows / 2; j++){
                if ((j == 0 || j == rows / 2) && i != 0 ||
                    i == 0 && j != 0 && j != rows / 2 || 
                    i == rows / 2) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
