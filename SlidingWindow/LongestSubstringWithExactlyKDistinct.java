package SlidingWindow;
import java.util.*;

public class LongestSubstringWithExactlyKDistinct {
    public static int longestSubstringExactlyKDistinct(String s, int k){
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0, left = 0;

        for(int right = 0; right < s.length(); right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);
            while(map.size() > k){
                char leftCharacter = s.charAt(left);
                map.put(leftCharacter, map.get(leftCharacter) - 1);
                if(map.get(leftCharacter) == 0) map.remove(leftCharacter);
                left++;
            }
            if(map.size() == k) maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = scan.nextLine();
        System.out.println("Enter value of K: ");
        int k = scan.nextInt();
        System.out.println("Longest substring with exactly `K` distinct characters: ");
        int result = longestSubstringExactlyKDistinct(s, k);
        System.out.println(result);
        scan.close();
    }
}
