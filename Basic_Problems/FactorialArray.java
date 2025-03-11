package Basic_Problems;
import java.util.*;

public class FactorialArray {
    public static long[] arrayFactorial(int[] array, int size){
        long[] factorialArray = new long[size];

        for(int i = 0; i < size; i++){
            int number = array[i];
            long factorial = 1;
            for(int j = number; j >= 1; j--){
                factorial *= j;
                if (factorial < 0) {
                    factorial = -1;
                    break;
                }
            }
            factorialArray[i] = factorial;
        }
        return factorialArray;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Factorial of array: ");
        System.out.println(Arrays.toString(arrayFactorial(array,size)));
        scan.close();
    }
}
