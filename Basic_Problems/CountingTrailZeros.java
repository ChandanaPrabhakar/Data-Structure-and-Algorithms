package Basic_Problems;
import java.util.*;

public class CountingTrailZeros {
    public static int countZeros(int number){
        if(number < 0){
            return -1;
        }
        int count = 0;
        for(int i = 5; number/i >= 1; i = i * 5){
            count += number / i;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("Number of trailing 0s: "+countZeros(number));
        scan.close();
    }
}
