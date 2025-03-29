package NeetCode150;
import java.util.*;

public class JumpGame {
    public static boolean jumpGame(int[] array){
        int maxReach = 0;
        for(int i = 0; i < array.length; i++){
            if(maxReach < i) return false;
            maxReach = Math.max(maxReach, i + array[i]);
        }
        return true;
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
        System.out.println("Best time to buy and sell stocks: "+jumpGame(array));
        scan.close();
    }
}
