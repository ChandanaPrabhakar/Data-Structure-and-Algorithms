package Arrays;
import java.util.*;

public class BuySell {
    public static int stockBuySell(int[] price, int size){
        int minimumSoFar = price[0], result = 0;

        for(int i = 0; i < size; i++){
            minimumSoFar = Math.min(minimumSoFar, price[i]);
            result = Math.max(result, price[i] - minimumSoFar);
        }
        return result;
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
        System.out.println("Stock Buy and Sell – Max one Transaction Allowed: "+stockBuySell(array, size));
        scan.close();
    }
}
