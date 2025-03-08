package Basic_Problems;
import java.util.*;

public class SeiveOfEratosthenus {
    public static void seive(int number){
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
        for(int i = 2; i <= number; i++){
            if(isPrime[i]){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int number = scan.nextInt();
        System.out.println("The prime numbers to range N: ");
        seive(number);
        scan.close();
    }
}
