package Strings;
import java.util.*;

public class CheckPalindrome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int length = str.length();
        boolean flag = true;
        for(int i = 0; i < length/2; i++){
            if(str.charAt(i) != str.charAt(length-i-1)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        scan.close();
    }
}
