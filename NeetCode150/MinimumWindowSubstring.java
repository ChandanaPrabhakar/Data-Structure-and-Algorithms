package NeetCode150;
import java.util.*;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String target){
        if (s.length() == 0 || target.length() == 0) return "";
        Map<Character, Integer> targetCount = new HashMap<>();
        for(char c : target.toCharArray()) targetCount.put(c, targetCount.getOrDefault(c,0) + 1);
        int left = 0, right = 0, formed = 0, required = targetCount.size();
        Map<Character, Integer> windowCount = new HashMap<>();
        int[] result = {-1, 0, 0};
        while(right < s.length()){
            char c = s.charAt(right);
            windowCount.put(c, windowCount.getOrDefault(c, 0)+1);
            if(targetCount.containsKey(c) && targetCount.get(c).intValue() == windowCount.get(c).intValue()){
                formed++;
            }
            while(left <= right && formed == required){
                c = s.charAt(left);
                if(result[0] == -1 || right - left + 1 < result[0]){
                    result[0] = right - left + 1;
                    result[1] = left;
                    result[2] = right;
                }
                windowCount.put(c, windowCount.get(c) - 1);
                if(targetCount.containsKey(c) && windowCount.get(c) < targetCount.get(c)){
                    formed--;
                }
                left++;
            }
            right++;
        }
        return result[0] == -1 ? "" : s.substring(result[1], result[2] + 1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = scan.nextLine();
        System.out.println("Enter target string: ");
        String target = scan.nextLine();
        System.out.println("Minimum window substring: "+minWindow(s, target));
        scan.close();
    }
}
