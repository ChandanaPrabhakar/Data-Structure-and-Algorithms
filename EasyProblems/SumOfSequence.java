package EasyProblems;
import java.util.*;

public class SumOfSequence {
    public static int sum(int number){
        int sum = 0, term = 0;
        for(int i = 0; i < number; i++){
            term = term * 10 + 2;
            sum += term;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("Sum of sequence 2, 22, 222, 2222, .... : "+sum(number));
        scan.close();
    }
}
