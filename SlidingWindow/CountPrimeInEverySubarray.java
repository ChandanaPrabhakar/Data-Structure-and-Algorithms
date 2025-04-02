package SlidingWindow;
import java.util.*;

public class CountPrimeInEverySubarray {
    public static boolean isPrime(int n){
        if(n < 2) return false;

        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static List<Integer> countPrime(int[] array, int size, int k){
        List<Integer> result = new ArrayList<>();
        int count = 0;

        for(int i = 0; i < k; i++){
            if(isPrime(array[i])){
                count++;
            }
        }

        result.add(count);

        for(int i = k; i < size; i++){
            if(isPrime(array[i - k])) count--;
            if(isPrime(array[i])) count++;
            result.add(count);
        }

        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int [] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Enter window size: ");
        int k = scan.nextInt();
        System.out.println("the count of prime numbers in every subarray of size K: ");
        List<Integer> result = countPrime(array, size, k);
        System.out.println(result);
        scan.close();
    }
}
