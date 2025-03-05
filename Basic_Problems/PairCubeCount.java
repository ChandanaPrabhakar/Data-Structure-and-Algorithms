package Basic_Problems;
import java.util.*;

public class PairCubeCount {
    public static int pairOfCubeCount(int number){
        int count = 0;
        for(int i = 1; i <= Math.cbrt(number); i++){
            int cube = i*i*i;
            int difference = number - cube;
            int cbrtDifference = (int)Math.cbrt(difference);

            if(cbrtDifference * cbrtDifference * cbrtDifference == difference){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("The count of pair of cube: "+pairOfCubeCount(number));
        scan.close();
    }
}
