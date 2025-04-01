package SlidingWindow;
import java.util.*;

public class CountOccurenceOfAnagrams {
    public static int countAnagram(String s, String t){
        int count = 0;
        int[] sFreq = new int[26];
        int[] tFreq = new int[26];

        if(s.length() < t.length()) return 0;

        for(int i = 0; i < t.length(); i++){
            if(s.charAt(i) == t.charAt(i)){
                sFreq[s.charAt(i) - 'a']++;
                tFreq[t.charAt(i) - 'a']++;
            }
        }

        if(Arrays.equals(sFreq, tFreq)) count++;

        for(int i = t.length(); i < s.length(); i++){
            sFreq[s.charAt(i) - 'a']++;
            sFreq[s.charAt(i - t.length()) - 'a']--;
            if(Arrays.equals(sFreq, tFreq)) count++;
        }

        

        return count;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of string s and target string t: ");
        String s = scan.nextLine();
        String t = scan.nextLine();
        System.out.println("Count of occurence of anagram in string: "+countAnagram(s, t));
        scan.close();
    }
}
