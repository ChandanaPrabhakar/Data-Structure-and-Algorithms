package Basic_Problems;
import java.util.*;

public class CountDigits {

    //O(log(n))
    public static int countOfDigits(int number){
        if(number == 0){
            return 1;
        }
        int count = 0;
        while(number > 0){
            number = number / 10;
            count++;
        }
        return count;
    }

    // O(1) approach

    public static int countDigits(int number){
        String numberToString = Integer.toString(number);
        return numberToString.length();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("The count of digits in "+number+" (O(log(n))): "+countOfDigits(number));
        System.out.println("The count of digits in "+number+" (O(1)): "+countDigits(number));
        scan.close();
    }
}
