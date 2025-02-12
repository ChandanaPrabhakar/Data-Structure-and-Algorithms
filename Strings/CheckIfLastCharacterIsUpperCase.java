package Strings;
import java.util.*;

public class CheckIfLastCharacterIsUpperCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if(str.charAt(str.length()-1) >= 'A' && str.charAt(str.length()-1) <= 'Z'){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        scan.close();
    }
}
