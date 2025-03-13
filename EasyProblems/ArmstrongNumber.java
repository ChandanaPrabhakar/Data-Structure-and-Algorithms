package EasyProblems;
import java.util.*;

public class ArmstrongNumber {
    public static boolean armstrongNumber(int number){
        String n = Integer.toString(number);
        int size = n.length();
        int sum = 0, temporaryVariable = number;
        for(int i = 0; i < size; i++){
            int rem = temporaryVariable % 10;
            sum = sum + (int)Math.pow(rem, size);
            temporaryVariable /= 10;
        }

        if(sum == number){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("is Armstrong number: "+armstrongNumber(number));
        scan.close();
    }
}
