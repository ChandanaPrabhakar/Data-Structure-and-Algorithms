package Basic_Problems;
import java.util.*;

public class PrimeFactorials {
    public static void primeFactorials(int number){
        while(number % 2 == 0){
            System.out.print(2+" ");
            number = number / 2;
        }

        for(int i = 3; i < Math.sqrt(number); i = i+2){
            while(number % i == 0){
                System.out.print(i+" ");
                number = number / i;
            }
        }

        if(number > 2){
            System.out.print(number);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("Prime factorials are: ");
        primeFactorials(number);
        scan.close();
    }
}
