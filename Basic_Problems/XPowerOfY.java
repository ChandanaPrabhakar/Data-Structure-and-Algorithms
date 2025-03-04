package Basic_Problems;
import java.util.*;

public class XPowerOfY {
    public static boolean xPowerOfY(int x, int y){
        float result = (float) (Math.log(y) / Math.log(x));
        return (result % 1 == 0);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of X: ");
        int x = scan.nextInt();
        System.out.println("Enter the value of Y: ");
        int y = scan.nextInt();
        System.out.println("Is X power of Y: "+ xPowerOfY(x, y));
        scan.close();
    }
}
