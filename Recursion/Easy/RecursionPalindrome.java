package Recursion.Easy;
import java.util.*;

public class RecursionPalindrome {
    public static boolean recPalindrome(String str, int start, int end){
        if(start == end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }

        if(start < end + 1){
            return recPalindrome(str, start+1, end-1);
        }

        return true;
    }
    public static boolean isPalindrome(String str){
        int length = str.length();
        if(length == 0){
            return true;
        }
        return recPalindrome(str, 0, length-1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string(str): ");
        String str1 = scan.nextLine();
        System.out.println(isPalindrome(str1));
        scan.close();
    }
}
