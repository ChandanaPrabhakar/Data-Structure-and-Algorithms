package Basic_Problems;
import java.util.*;

public class MinimumDifference {
    static int sz = (int) 1e5;
    static boolean []isPrime = new boolean [sz + 1];
    public static void seive(){
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for(int i = 2; i * i<= sz; i++){
            if(isPrime[i]){
                for(int j = i * i; j < sz; j += i){
                    isPrime[j] = false;
                }
            }
        }
    }
    public static int findMinimumDifference(int start, int end){

        int first = 0;
        for(int i = start; i <= end; i++){
            if(isPrime[i]){
                first = i;
                break;
            }
        }
        int second = 0;
        for(int i = first + 1; i <= end; i++){
            if(isPrime[i]){
                second = i;
                break;
            }
        }
        int difference = second - first;

        start = second + 1;
        for(int i = start; i <= end; i++){
            if(isPrime[i]){
                if(i - second <= difference){
                    first = second;
                    second = i;
                    difference = second - first;
                }
            }
        }
        return difference;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        seive();
        System.out.println("Enter start and end: ");
        int start = scan.nextInt();
        int end = scan.nextInt();
        System.out.println("Minimum difference between any two primes from the given range: "+findMinimumDifference(start, end));
        scan.close();
    }
}
