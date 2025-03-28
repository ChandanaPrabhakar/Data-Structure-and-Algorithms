package NeetCode150;
import java.util.*;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t){
        if(s.length() > t.length()) return false;
        int i = 0, j = 0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the strings s and t:");
        String s = scan.nextLine();
        String t = scan.nextLine();
        System.out.println("Is subsequence: "+isSubsequence(s, t));
        scan.close();
    }
}
