package NeetCode150;
import java.util.*;

public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2){
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        if(s1.length() > s2.length()) return false;

        for(char c : s1.toCharArray()){
            count1[c - 'a']++;
        }

        for(int i = 0; i < s2.length(); i++){
            count2[s2.charAt(i) - 'a']++;

            if(i >= s1.length()){
                count2[s2.charAt(i - s1.length()) - 'a']--;
            }
            if(Arrays.equals(count1, count2)) return true;
        }

        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String 1 and String 2: ");
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        System.out.println("Permutation of s1 in s2: "+checkInclusion(s1, s2));
        scan.close();
    }
}
