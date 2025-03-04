package Basic_Problems;
import java.util.*;

public class RevreseDigitsOfNumber {
    public static int reverseNumber(int number){
        int reverse = 0;
        while(number > 0){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return reverse;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("The reverse of number: "+reverseNumber(number));
        scan.close();
    }
}
