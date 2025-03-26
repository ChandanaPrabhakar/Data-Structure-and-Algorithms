package NeetCode150;
import java.util.*;

public class BestTimeToBuySellStocks {
    public static int maxProfit(int[] prices){
        int minimumPrice = Integer.MAX_VALUE, maximumProfit = 0;
        for(int price: prices){
            minimumPrice = Math.min(minimumPrice, price);
            maximumProfit = Math.max(maximumProfit, price - minimumPrice);
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
        System.out.println("Best time to buy and sell stocks: "+maxProfit(array));
        scan.close();
    }
}
