package Strings;
import java.util.*;

public class MidStringToUppercase {
    public static String midStringToUpperCase(String str){
        // char[] result = new char[str.length()];
        // result[0] = str.charAt(0);
        // result[str.length()-1] = str.charAt(str.length() -1);
        // for(int i = 1; i < str.length()-1; i++){
        //     result[i] = Character.toUpperCase(str.charAt(i));
        // }
        // return String.valueOf(result);
        String initialString = str.substring(0,1).toLowerCase();
        String lastString = str.substring(str.length()-1).toLowerCase();
        String middleString = str.substring(1,str.length()-1).toUpperCase() ;
        return initialString+middleString+lastString;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(midStringToUpperCase(str));
        scan.close();
    }
}
