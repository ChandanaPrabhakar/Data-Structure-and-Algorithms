package Strings;
import java.util.*;

public class firstCharacterUppercase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 strings: ");
        String S1 = scan.nextLine();
        String S2 = scan.nextLine();
        S1 = S1.substring(0,1).toUpperCase() + S1.substring(1);
        S2 = S2.substring(0,1).toUpperCase() + S2.substring(1);

        System.out.println(S1+" "+S2);
        scan.close();
    }
}
