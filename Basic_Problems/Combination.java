package Basic_Problems;
import java.util.*;

public class Combination {
    public static double nCr(int totalNumber, int selection){
        double sum = 1;
        for(int i = 1; i <= selection; i++){
            sum = sum * (totalNumber - selection + i) / i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n and r: ");
        int totalNumber = scan.nextInt();
        int selection = scan.nextInt();
        System.out.println("nCr = "+nCr(totalNumber, selection));
        scan.close();
    }
}
