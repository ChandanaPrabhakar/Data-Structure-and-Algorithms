package EasyProblems;
import java.util.*;

public class NearestFibonacciNumber {
    public static int nearestFibonacci(int number){
        if(number == 0){
            return 0;
        }

        int first = 0, second = 1;
        int third = first + second;
        while(third <= number){
            first = second;
            second = third;
            third = first + second;
        }

        int ans = (Math.abs(third - number) >= Math.abs(second - number) ? second : third) ;
        return ans;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int number = scan.nextInt();
        System.out.println("nearest fibonacci number: "+nearestFibonacci(number));
        scan.close();
    }
}
