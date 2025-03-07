package Basic_Problems;
import java.util.*;



// Padovan sequence : 1,1,1,2,2,3,4,5....
// P(n) = P(n-2) + p(n-3)
// P(0) = P(1) = P(2) = 1
public class PadovanSequence {
    public static int padovanSequence(int number){
        int[] array = new int[number + 1];
        array[0] = array[1] = array[2] = 1;
        for(int i = 3; i <= number; i++){
            array[i] = array[i - 2] + array[i - 3];
        }
        return array[number];
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int number = scan.nextInt();
        System.out.println("P("+number+") = "+padovanSequence(number));
        scan.close();
    }
}
