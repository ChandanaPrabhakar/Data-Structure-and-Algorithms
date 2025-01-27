package Recursion.Easy;
import java.util.*;

public class StringReverse {
    public static String RecStringReverse(String str, int length){
        if(length < 1){
            return "";
        }
        if(length == 1){
            return String.valueOf(str.charAt(length-1));
        }
        return str.charAt(length-1)+ RecStringReverse(str, length-1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scan.nextLine();
        System.out.print(RecStringReverse(str, str.length()));
        scan.close();
    }
}
