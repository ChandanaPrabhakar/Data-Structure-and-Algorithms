package NeetCode150;
import java.util.*;

public class ValidAnagram {
    public static boolean isAnagram(String string1 , String string2){
        if(string1.length() != string2.length()){
            return false;
        }

        int[] charCount = new int[26];
        for(int i = 0; i < string1.length(); i++){
            charCount[string1.charAt(i) - 'a']++;
            charCount[string2.charAt(i) - 'a']--;
        }
        
        for(int number : charCount){
            if(number != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string1 and string2: ");
        String string1 = scan.nextLine();
        String string2 = scan.nextLine();
        System.out.println("Return true if the two strings are anagrams of each other, otherwise return false: "+isAnagram(string1, string2));
        scan.close();
    }
}
