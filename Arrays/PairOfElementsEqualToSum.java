package Arrays;
import java.util.*;

public class PairOfElementsEqualToSum {
    public static void pairOfElementsEqualToSum(int[] array, int size, int sum){
        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
                if(array[i] + array[j] == sum){
                    System.out.println(array[i]+" , "+array[j]);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sum: ");
        int sum = scan.nextInt();
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int array[] = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        pairOfElementsEqualToSum(array, size, sum);
        scan.close();
    }
}
