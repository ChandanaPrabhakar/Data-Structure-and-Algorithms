package EasyProblems;
import java.util.*;

public class PerfectSquareI {
    public static boolean perfectSquare(int number){
        if(Math.ceil(Math.sqrt(number)) == Math.floor(Math.sqrt(number))){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int number = scan.nextInt();
        System.out.println("Perfect square: "+perfectSquare(number));
        scan.close();
    }
}
