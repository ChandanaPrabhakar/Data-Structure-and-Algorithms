package Basic_Problems;
import java.util.*;

public class NoOfWayAtoB {
    public static int factorial(int number){
        if(number == 0 || number == 1){
            return 1;
        }
        int fact = 1;
        while(number >= 2){
            fact *= number;
            number--;
        }
        return fact;
    }
    public static int pointAtoB(int point){
        int total = factorial(point+point);
        int total1 = factorial(point);
        return (total / total1 )/ total1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the point: ");
        int point = scan.nextInt();
        System.out.println("Number of ways to go from one point to another in a grid: "+pointAtoB(point));
        scan.close();
    }
}
