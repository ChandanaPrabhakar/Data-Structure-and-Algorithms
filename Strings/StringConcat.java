package Strings;
import java.util.*;

public class StringConcat {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String  str1 = scan.nextLine();
        String str2 = scan.nextLine();
        System.out.println(str1 += str2);
        scan.close();
    }
}
