package Basic_Problems;
import java.util.*;

public class NthPrime {
    static int max = 100005;
    static ArrayList <Integer> prime = new ArrayList<>();

    public static void seive(){
        boolean []isPrime = new boolean[max];
        Arrays.fill(isPrime, true);
        for(int i = 2; i * i < max; i++){
            if(isPrime[i]){
                for(int j = i * i; j < max; j += i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i = 2; i < max; i++){
            if(isPrime[i]){
                prime.add(i);
            }
        }
    }
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        seive();
        int number = scan.nextInt();
        System.out.println(number+ " prime number is: "+prime.get(number-1));
        scan.close();
    }
}
