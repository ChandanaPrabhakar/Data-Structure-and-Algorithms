package Basic_Problems;
import java.util.*;

public class CheckFactorialNumber {
    public static boolean checkFactorial(int number){
        for(int i = 1; ; i++){
            if(number % i == 0){
                number = number / i;
            }else{
                break;
            }
        }
        if(number == 1){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("Is the given number a factorial of any number: "+checkFactorial(number));
        scan.close();
    }
}
