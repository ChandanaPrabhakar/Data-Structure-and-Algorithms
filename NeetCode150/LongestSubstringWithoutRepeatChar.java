package NeetCode150;
import java.util.*;

public class LongestSubstringWithoutRepeatChar {
    public static int lengthOfLongestSubstring(String s){
        int left = 0, maximumLength = 0;
        Set<Character> entry = new HashSet<>();
        for(int right = 0; right < s.length(); right++){
            if(entry.contains(s.charAt(right))){
                entry.remove(s.charAt(left));
                left++;
            }
            entry.add(s.charAt(right));
            maximumLength = Math.max(maximumLength, right - left + 1);
        }
        return maximumLength;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = scan.nextLine();
        System.out.println("longest substring without repeating character: "+lengthOfLongestSubstring(s));
        scan.close();
    }
}
