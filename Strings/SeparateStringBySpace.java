package Strings;
import java.util.*;

public class SeparateStringBySpace {
    public static void splitStringBySpace(String str){
        String[] words = str.split(" ");
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        splitStringBySpace(str);
        scan.close();
    }
}
