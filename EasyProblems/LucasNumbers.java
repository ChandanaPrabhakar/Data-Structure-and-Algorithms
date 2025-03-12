package EasyProblems;
import java.util.*;

class LucasNumbers{
    public static int lucasNumber(int number){
        int firstNumber = 2;
        int secondNumber = 1;
        int lucas = 0;

        if(number == 0){
            return firstNumber;
        }

        for(int i = 2; i <= number; i++){
            lucas = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = lucas;
        }
        return lucas;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int number = scan.nextInt();
        System.out.println("Lucas number at opsition "+number+" : "+lucasNumber(number));
        scan.close();
    }
}