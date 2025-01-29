package Patterns;
import java.util.*;

public class SquarePatternNum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side: ");
        int side = scan.nextInt();
        for(int i = 0; i < side; i++){
            for(int j = 0; j < side; j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
