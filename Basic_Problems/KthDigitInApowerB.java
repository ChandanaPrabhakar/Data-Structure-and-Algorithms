package Basic_Problems;
import java.util.*;

public class KthDigitInApowerB {
    public static int kthDigit(int number1, int number2, int k){
        int count = 0, rem = 0;
        double power = Math.pow(number1, number2);

        if(power > 0 && count < k){
            rem =(int) power % 10;
            count++;
            if(count == k){
                return rem;
            }

            power = power / 10;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of A, B, k: ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int k = scan.nextInt();
        System.out.println("Kth digit in "+number1+"^"+number2+" : "+kthDigit(number1, number2, k));
        scan.close();
    }
}
