package Strings;
import java.util.*;

public class CheckIfFirstCharIsUpperCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if(str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        scan.close();
    }
}
