package Basic_Problems;
import java.util.*;

public class LCMofTwoNumbers {
    public static int gcd(int number1, int number2){
        if(number1 == 0) return number2;
        if(number2 == 0) return number1;
        return gcd(number2, number1 % number2);
    }
    public static int lcm(int number1, int number2){
        return (number1 * number2) / gcd(number1, number2);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.println("The LCM of "+number1+" and "+number2+" : "+lcm(number1,number2));
        scan.close();
    }
}
