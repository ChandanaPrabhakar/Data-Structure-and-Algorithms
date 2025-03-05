package Basic_Problems;
import java.util.*;

public class AdditionOfFraction {
    public static int gcd(int number1, int number2){
        if(number1 == 0) return number2;
        if(number2 == 0) return number1;
        return gcd(number2, number1 % number2);
    }
    public static void lowest(int numerator, int denominator){
        int common_gcd = gcd(numerator, denominator);
        numerator = numerator / common_gcd;
        denominator = denominator / common_gcd;
        System.out.println(numerator+"/"+denominator);

    }
    public static void addFractions(int numerator1, int denominator1, int numerator2, int denominator2){
        int common_denominator = gcd(denominator1, denominator2);

        common_denominator = (denominator1 * denominator2) / common_denominator;
        int common_numerator = ((numerator1 * common_denominator) / denominator1) + ((numerator2 * common_denominator) / denominator2);

        lowest(common_numerator, common_denominator);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numerators and denominators of two factors: ");
        int numerator1 = scan.nextInt();
        int denominator1 = scan.nextInt();
        int numerator2 = scan.nextInt();
        int denominator2 = scan.nextInt();

        System.out.println("Addition of fractions "+numerator1+"/"+denominator1+" and "+numerator2+"/"+denominator2+" : ");
        addFractions(numerator1, denominator1, numerator2, denominator2);
        scan.close();
    }
}
