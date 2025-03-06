package Patterns;
import java.util.*;

public class SierpinskiTriangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side size: ");
        int side = scan.nextInt();

        for(int i = side - 1; i >= 0; i--){
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j+i < side; j++) {
                if ((j & i) != 0) {
                    System.out.print("  "); 
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        scan.close();
    }

}
