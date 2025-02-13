package Strings;
import java.util.*;

public class CharAtSpecifiedIndex {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("Enter the index value: ");
        int index = scan.nextInt();
        if(index <= str.length()){
            System.out.println(str.charAt(index));
        }else{
            System.out.println(-1);
        }
        scan.close();
    }
}
