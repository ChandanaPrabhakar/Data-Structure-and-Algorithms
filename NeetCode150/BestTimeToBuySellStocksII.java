package NeetCode150;
import java.util.*;

public class BestTimeToBuySellStocksII {
    public static int maxProfitII(int[] prices){
        int maximumProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i - 1]){
                maximumProfit += prices[i] - prices[i - 1];
            }
        }
        return maximumProfit;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Best time to buy and sell stocks: "+maxProfitII(array));
        scan.close();
    }
}
