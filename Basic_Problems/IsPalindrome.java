package Basic_Problems;
import java.util.*;

public class IsPalindrome {

    //Reverse Number approach
    public static boolean checkForPalindromeI(int number){
        int reverse = 0;
        int temporaryVariable = number;
        while(temporaryVariable > 0){
            int remainder = temporaryVariable % 10;
            reverse = reverse * 10 + remainder;
            temporaryVariable = temporaryVariable / 10;
        }
        System.out.println(reverse);
        return reverse == number;
    }

    //String approach
    public static boolean checkForPalindromII(int number){
        String palindrome = Integer.toString(number);
        int size = palindrome.length();

        for(int i = 0; i < size/2; i++){
            if(palindrome.charAt(i) != palindrome.charAt(size - i - 1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();

        System.out.println("Is palindrome (Reverse number approach): "+checkForPalindromeI(number));
        System.out.println("Is palindrome (String approach): "+checkForPalindromII(number));
        scan.close();
    }
}
