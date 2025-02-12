package Strings;
import java.util.*;

public class StringReverse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String reverseString = "";
        for(int i = str.length()-1; i >= 0; i--){
            reverseString += str.charAt(i);
        }
        System.out.println(reverseString);
        scan.close();
    }
}
