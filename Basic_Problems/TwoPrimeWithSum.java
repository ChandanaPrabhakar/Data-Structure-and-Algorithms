package Basic_Problems;
import java.util.*;

public class TwoPrimeWithSum {
    public static boolean[] sieve(int number){
        boolean[] isPrime = new boolean[number + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for(int i = 2; i * i <= number; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= number; j += i){
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    public static void findGoldbachPair(int sum){
        boolean[] isPrime = sieve(sum);
        for(int i = 2; i <= sum / 2; i++){
            if(isPrime[i] && isPrime[sum - i]){
                System.out.print(i+" , "+(sum - i));
                return;
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sum: ");
        int sum = scan.nextInt();
        System.out.println("Two prime numbers with give sum: ");
        findGoldbachPair(sum);
        scan.close();
    }
}
