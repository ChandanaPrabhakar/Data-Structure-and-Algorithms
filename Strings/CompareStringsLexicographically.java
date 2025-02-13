package Strings;
import java.util.*;

public class CompareStringsLexicographically {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string one: ");
        String str1 = scan.nextLine();
        System.out.println("Enter String two: ");
        String str2 = scan.nextLine();
        int result = str1.compareTo(str2);
        if(result < 0){
            System.out.println("First string is lesser than second");
        }else if(result == 0){
            System.out.println("Strings are lexicographically equal");
        }else if(result > 0){
            System.out.println("Second string is greater than first");
        }
        scan.close();
    }
}
