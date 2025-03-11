package Basic_Problems;
import java.util.*;

public class SmallNumberWithLeastTrailling0 {
    public static int trailingZeros(int zero){
        int number = 1;
        int count = 0;
        while(true){
            int temporaryVariable = number;

            while(temporaryVariable % 5 == 0){
                count++;
                temporaryVariable /= 5;
            }

            if(count >= zero){
                return number;
            }
            number++;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of zeros: ");
        int zero = scan.nextInt();
        System.out.println("Small number with least trailing zeros: "+trailingZeros(zero));
        scan.close();
    }
}
