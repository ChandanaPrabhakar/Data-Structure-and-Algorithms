package Basic_Problems;

import java.util.*;

public class StrongPrime {
    public static boolean isPrime(int prime){
        if(prime <= 1) return false;
        if(prime <= 3) return true;
        if(prime % 2 == 0 || prime % 3 == 0) return false;

        for(int i = 5; i * i <= prime; i += 6){
            if(prime % i == 0 || prime % (i+2) == 0){
                return false;
            }
        }
        return true;
    }
    public static String isStrongPrime(int prime){
        if(!isPrime(prime) || prime == 2) return "No";

        int nextPrime = prime + 1;
        int previousPrime = prime - 1;

        while(!isPrime(nextPrime)){
            nextPrime++;
        }

        while(!isPrime(previousPrime)){
            previousPrime--;
        }

        int mean = (nextPrime + previousPrime) / 2;

        if(prime > mean){
            return "Yes";
        }else{
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int prime = scan.nextInt();
        System.out.println("The number is Strong prime: " + isStrongPrime(prime));
        scan.close();
    }
}
