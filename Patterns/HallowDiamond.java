package Patterns;
import java.util.*;

public class HallowDiamond {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scan.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < rows-i-1; j++){
                System.out.print("  ");
            }
            System.out.print("* ");
            if(i != 0){
                for(int j = 0; j < 2*i-1; j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 0; i < rows - 1; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print("  ");
            }
            System.out.print("* ");
            if(i != rows-2){
                for(int j = 0; j < 2*(rows-i)-5; j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }
}
