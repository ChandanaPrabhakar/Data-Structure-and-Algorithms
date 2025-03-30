package NeetCode150;
import java.util.*;

public class RomanToInteger {
    public static int romanToInteger(String roman){
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int result = 0;
        for(int i = 0; i < roman.length(); i++){
            if( i > 0 && romanMap.get(roman.charAt(i)) > romanMap.get(roman.charAt(i - 1))){
                result += romanMap.get(roman.charAt(i)) - 2 * romanMap.get(roman.charAt(i - 1));
            }else{
                result += romanMap.get(roman.charAt(i));
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Roman number: ");
        String roman = scan.nextLine();
        System.out.println("Roman to Integer: "+romanToInteger(roman));
        scan.close();
    }
}
