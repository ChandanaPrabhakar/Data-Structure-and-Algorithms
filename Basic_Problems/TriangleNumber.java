package Basic_Problems;
import java.util.*;

public class TriangleNumber {
    public static boolean isTriangleNumber(int number){
        if(number < 0){
            return false;
        }
        int a = 1, b = 1;
        int c = -2 * number;
        int d = b * b - 4 * a * c;

        float root1 = (b + (float) Math.sqrt(d)) / (2 * a);
        float root2 = (b - (float) Math.sqrt(d)) / (2 * a);

        if(root1 > 0 && Math.floor(root1) == root1){
            return true;
        }
        if(root2 > 0 && Math.floor(root2) == root2){
            return true;
        }

        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();

        System.out.println("Is the number triangle number or not: "+isTriangleNumber(number));
        scan.close();
    }
}
