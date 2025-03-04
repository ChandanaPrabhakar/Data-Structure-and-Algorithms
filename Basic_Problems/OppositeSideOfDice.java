package Basic_Problems;
import java.util.*;

public class OppositeSideOfDice {
    public static int oppsiteFace(int number){
        return 7 - number;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number on dice: ");
        int number = scan.nextInt();
        System.out.println("The opposite side of number in dice: "+oppsiteFace(number));
        scan.close();
    }
}
