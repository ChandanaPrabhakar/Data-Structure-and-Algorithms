package Basic_Problems;
import java.util.*;

public class NextPrime {
    public static boolean isPrime(int prime){
        if(prime <= 1) return false;
        if(prime <= 3) return true;
        if(prime % 2 == 0 || prime % 3 == 0) return false;
        for(int i = 5; i * i <= prime; i += 6){
            if(prime % i == 0 || prime % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }
    public static int findNextPrime(int number){
        if(number <= 1){
            return 2;
        }
        int prime = number;
        boolean found = false;

        while(!found){
            prime++;
            if(isPrime(prime)){
                found = true;
            }
        }
        return prime;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("The next prime: "+findNextPrime(number));
        scan.close();
    }
}
