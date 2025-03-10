package Basic_Problems;
import java.util.*;

public class LastNon0Digit {
    static int[] lastDigit = {1,1,2,6,4,2,2,4,2,8};
    public static int lastNonZeroDigit(int number){
        if(number < 10){
            return lastDigit[number];
        }

        if(((number / 10) % 10) % 2 == 0){
            return (6 * lastNonZeroDigit(number / 5) * lastDigit[number % 10]) % 10;
        }else{
            return (4 * lastNonZeroDigit(number / 5) * lastNonZeroDigit(number % 10)) % 10;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("Last non-zero digit of factorial: "+lastNonZeroDigit(number));
        scan.close();
    }
}
