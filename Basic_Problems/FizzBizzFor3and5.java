package Basic_Problems;
import java.util.*;

public class FizzBizzFor3and5 {
    public static ArrayList<String> fizzbizz(int number){
        ArrayList<String> result = new ArrayList<String>();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Fizz");
        map.put(5, "Bizz");
        int [] divisors = {3,5};
        
        for(int i = 1; i <= number; i++){
            StringBuilder str = new StringBuilder();
            for(int divisor : divisors){
                if( i % divisor == 0){
                    str.append(map.get(divisor));
                }
            }
            if(str.length() == 0){
                str.append(i);
            }
            result.add(str.toString());
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int number = scan.nextInt();
        ArrayList<String> result = fizzbizz(number);
        System.out.println("Enter Fizz if number is divisible by 3 and Bizz if number is divisible by 5: "+result);
        scan.close();
    }

}
