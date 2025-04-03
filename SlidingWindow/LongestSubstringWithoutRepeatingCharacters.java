package SlidingWindow;
import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int longestSubstringWithoutRepeatingCharacter(String s){
        Set<Character> set = new HashSet<>();
        int maxLength = 0, left = 0;
        for(int right = 0; right < s.length(); right++){
            if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            } 
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = scan.nextLine();
        System.out.println("Longest substring without repeating characters: ");
        int result = longestSubstringWithoutRepeatingCharacter(s);
        System.out.println(result);
        scan.close();
    }
}
