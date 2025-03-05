package Basic_Problems;
import java.util.*;

public class SquarerootOfNumber {
    public static int sqrtOfNumber(int number){
        int leftLimit = 1, rightLimit = number, result = 1;
        while(leftLimit <= rightLimit){
            int mid = leftLimit + (rightLimit - leftLimit) / 2;

            if(mid * mid <= number){
                result = mid;
                leftLimit = mid + 1;
            }else{
                rightLimit = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("Squareroot of number: "+sqrtOfNumber(number));
        scan.close();
    }
}
