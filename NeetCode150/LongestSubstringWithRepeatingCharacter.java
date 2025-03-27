package NeetCode150;
import java.util.*;

public class LongestSubstringWithRepeatingCharacter {
    public static int characterReplacement(String s, int k){
        int left = 0, maximumCount = 0, maximumLength = 0;
        int[] count = new int[26];
        
        for(int right = 0; right < s.length(); right++){
            maximumCount = Math.max(maximumCount, ++count[s.charAt(right) - 'A']);

            while(right - left + 1 - maximumCount > k){
                count[s.charAt(left) - 'A']--;
                left++;
            }
            maximumLength = Math.max(maximumLength, right - left + 1);
        }
        return maximumLength;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = scan.nextLine();
        System.out.println("Enter the value of K: ");
        int k = scan.nextInt();
        System.out.println("Longest substring with repeating character: "+characterReplacement(s, k));
        scan.close();
    }
}
