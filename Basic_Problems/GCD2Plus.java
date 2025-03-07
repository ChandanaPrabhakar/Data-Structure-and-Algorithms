package Basic_Problems;
import java.util.*;

public class GCD2Plus {
    public static int gcd(int number1, int number2){
        if(number1 == 0) return number2;
        if(number2 == 0) return number1;

        return gcd(number2, number1%number2);
    }
    public static int getGCD(int []array, int size){
        int result = array[0];
        for(int i = 1; i < size; i++){
            result = gcd(array[i], result);

            if(result == 1){
                return 1;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int [] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("GCD of array elements: "+getGCD(array, size));
        scan.close();
    }
}
