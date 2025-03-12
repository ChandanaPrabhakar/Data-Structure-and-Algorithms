package EasyProblems;
import java.util.*;

public class ThreeDivisor {
    public static boolean isPrime(int number){
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
    public static void divisors(int number){
        for(int i = 2; i * i <= number; i++){
            if(isPrime(i)){
                System.out.println(i*i + " ");
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int number = scan.nextInt();
        System.out.println("numbers from 1 to n with exactly 3 divisors: ");
        divisors(number);
        scan.close();
    }
}
