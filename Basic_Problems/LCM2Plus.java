package Basic_Problems;
import java.util.*;

public class LCM2Plus {
    public static int gcd(int number1, int number2){
        if(number1 == 0) return number2;
        if(number2 == 0) return number1;

        return gcd(number2, number1 % number2);
    }
    public static int lcm(int[] array, int size){
        int lcm = array[0];
        for(int i = 1; i < size; i++){
            int gcd = gcd(lcm , array[i]);
            lcm = lcm * array[i] / gcd;
        }
        return lcm;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int []array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("The LCM of array: "+lcm(array, size));
        scan.close();
    }
}
