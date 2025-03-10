package Basic_Problems;
import java.util.*;

public class DoubleFactorial {
    public static int doubleFactorial(int number){
        if(number == 0 || number == 1){
            return 1;
        }
        int factorial = 1;

        //Recursion Method - return number * doubleFactorial(number - 2);

        for(int i = number; i >= 2; i -= 2){
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("Double factorial of "+number+" : "+doubleFactorial(number));
        scan.close();
    }
}
