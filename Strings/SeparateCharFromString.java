package Strings;
import java.util.*;

public class SeparateCharFromString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
        scan.close();
    }
}
