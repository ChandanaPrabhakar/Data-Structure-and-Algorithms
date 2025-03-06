package Patterns;
import java.util.*;

public class HalfStairCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = scan.nextInt();
        for(int i = 1; i <= rows; i++){
            int k;
            if(i % 2 != 0){
                k = i + 1;
            }else{
                k = i;
            }
            for(int j = 1; j <= k; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        scan.close();
    }
}
