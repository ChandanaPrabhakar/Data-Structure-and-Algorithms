package Basic_Problems;
import java.util.*;

public class CheckEvenOdd {
    public static String checkEvenOrOdd(int number){
        if(number % 2 == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        System.out.println("Check if "+number+" is even or odd: "+ checkEvenOrOdd(number));
        scan.close();
    }
}
