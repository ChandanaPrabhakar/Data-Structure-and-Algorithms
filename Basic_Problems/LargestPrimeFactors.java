package Basic_Problems;
import java.util.*;

public class LargestPrimeFactors {
    public static int largestPrimefactor(int number){
        int largestPrimeFactor = -1;

        while(number % 2 == 0){
            largestPrimeFactor = 2;
            number = number / 2;
        }
        for(int i = 3; i < Math.sqrt(number); i = i+2){
            while(number % i == 0){
                largestPrimeFactor = i;
                number = number / i;
            }
        }
        if(number > 2){
            largestPrimeFactor = number;
        }
        return largestPrimeFactor;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("The largest prime factor is: "+largestPrimefactor(number));
        scan.close();
    }
}
