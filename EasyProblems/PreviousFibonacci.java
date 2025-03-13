package EasyProblems;

import java.util.*;

public class PreviousFibonacci {
    public static int previousFibo(int number) {
        double a = number / ((1 + Math.sqrt(5)) / 2.0);
        return (int) Math.round(a);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int number = scan.nextInt();
        System.out.println("The previous fibonacci number: " + previousFibo(number));
        scan.close();
    }
}
