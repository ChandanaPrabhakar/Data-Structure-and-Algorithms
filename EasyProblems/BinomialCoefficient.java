package EasyProblems;
import java.util.*;

public class BinomialCoefficient {
    public static int binomialCoefficient(int totalNumber, int selector){
        int[] dp = new int[selector + 1];

        dp[0] = 1;
        for(int i = 1; i <= totalNumber; i++){
            for(int j = Math.min(i, selector); j > 0; j--){
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return dp[selector];
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of N and R: ");
        int totalNumber = scan.nextInt();
        int selector = scan.nextInt();
        System.out.println("Binomial coefficient: "+binomialCoefficient(totalNumber, selector));
        scan.close();
    }
}
