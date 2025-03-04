package Basic_Problems;
import java.util.*;

public class DistanceBetween {
    public static double distanceBetweenTwoPoints(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        System.out.println("The distance between two points: "+distanceBetweenTwoPoints(x1, y1, x2, y2));
        scan.close();
    }
}
