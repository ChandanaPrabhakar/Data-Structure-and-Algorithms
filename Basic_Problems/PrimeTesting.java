package Basic_Problems;
import java.util.*;

public class PrimeTesting {
    public static boolean checkIsPrime(int number){
        if(number <=1){
            return false;
        }

        for(int i = 2; i < Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("Is prime: "+ checkIsPrime(number));
        scan.close();
    }
}
