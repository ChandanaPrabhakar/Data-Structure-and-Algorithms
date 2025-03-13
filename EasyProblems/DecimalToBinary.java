package EasyProblems;
import java.util.*;

public class DecimalToBinary {
    public static String decToBin(int number){
        StringBuilder binary = new StringBuilder();
        while(number > 0){
            int bit = number % 2;
            binary.append((char)('0' + bit));
            number /= 2;
        }
        binary.reverse();
        return binary.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre the decimal number: ");
        int number = scan.nextInt();
        System.out.println("Decimal to Binary: "+decToBin(number));
        scan.close();
    }
}
