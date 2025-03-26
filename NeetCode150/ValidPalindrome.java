package NeetCode150;
import java.util.*;

public class ValidPalindrome {
    public static boolean isValidPalindrome(String s){
        StringBuilder filtered = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                filtered.append(Character.toLowerCase(c));
            }
        }
        return filtered.toString().equals(filtered.reverse().toString());
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = scan.nextLine();
        System.out.println("is the string s a valid palindrome: "+isValidPalindrome(s));
        scan.close();
    }
}
