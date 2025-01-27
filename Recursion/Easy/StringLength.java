package Recursion.Easy;
import java.util.*;

public class StringLength {
    public static int RecStringLength(String str){
        if(str.equals("")){
            return 0;
        }
        return RecStringLength(str.substring(1)) + 1;
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scan.nextLine();
        System.out.println(RecStringLength(str));
        scan.close();
    }
}
