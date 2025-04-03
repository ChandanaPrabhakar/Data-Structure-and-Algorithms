package SlidingWindow;
import java.util.*;

public class NumberSubstringExactlyKDistinct {
    public static int countAtMostKDistinct(String s, int k){
        int count = 0, left = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int right = 0; right < s.length(); right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);
            while(map.size() > k){
                char leftCharacter = s.charAt(left);
                map.put(leftCharacter, map.get(leftCharacter) - 1);
                if(map.get(leftCharacter) == 0) map.remove(leftCharacter);
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }

    public static int countOfExactlyKDistinct(String s, int k){
        return countAtMostKDistinct(s, k) - countAtMostKDistinct(s, k - 1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string s: ");
        String s = scan.nextLine();
        System.out.println("Enter window size: ");
        int k = scan.nextInt();
        System.out.println("the number of substrings with exactly `K` distinct characters: ");
        int result = countOfExactlyKDistinct(s, k);
        System.out.println(result);
        scan.close();
    }
}
