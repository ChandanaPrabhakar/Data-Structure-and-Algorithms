package Basic_Problems;
import java.util.*;

public class ValidTriangle {
    public static boolean checkForValidTriangle(int side1, int side2, int side3){
        if((side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2)){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 sides of triangle; ");
        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        int side3 = scan.nextInt();
        System.out.println("is triangle valid: "+checkForValidTriangle(side1, side2, side3));
        scan.close();
    }
}
