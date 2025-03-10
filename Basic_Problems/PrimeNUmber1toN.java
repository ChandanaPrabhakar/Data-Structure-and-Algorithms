package Basic_Problems;
import java.util.*;

public class PrimeNUmber1toN {
    public static boolean prime(int number){
        if(number == 0 || number == 1) return false;

        for(int i = 2; i * i <= number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int number = scan.nextInt();
        System.out.print("prime numbers from 1 to "+number+" : ");
        for(int i = 1; i <= number; i++){
            if(prime(i)){
                System.out.print (i+" ");
            }
        }
        scan.close();
    }
}
