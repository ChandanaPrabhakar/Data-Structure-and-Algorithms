package Recursion.Easy;
import java.util.*;

public class LargestPower {
    public static int largestPowerofP(int num, int p){
        if(num == 0){
            return 0;
        }
        return num/p + largestPowerofP(num/p, p);
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer num: ");
        int num = scan.nextInt();
        System.out.println("Enter the prime number p:");
        int p = scan.nextInt();
        System.out.println("largest x such that px divides n!"+largestPowerofP(num, p));
        scan.close();
    }
}
