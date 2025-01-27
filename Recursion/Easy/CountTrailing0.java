package Recursion.Easy;
import java.util.*;

public class CountTrailing0 {
    public static int CountTrailZero(int num){
        if(num < 5){
            return 0;
        }
        return num/5 + CountTrailZero(num/5);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer num: ");
        int num = scan.nextInt();
        System.out.println("Count of trailing 0s in " + num + "! is: "+CountTrailZero(num));    
        scan.close();
    }

}
