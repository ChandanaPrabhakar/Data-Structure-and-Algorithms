package Recursion.Easy;
import java.util.*;

public class FibonacciNumber {
    public static int findfibonaccinumber(int num){
        if(num == 0){
            return 0;
        }else if(num == 1){
            return 1;
        }else{
            return findfibonaccinumber(num - 2) + findfibonaccinumber(num - 1);
        }
    }
    static List<Integer> FindFibonacciNumber(int num) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < num; i++) {
           ans.add(findfibonaccinumber(i));
        }
        return ans;
     }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number num: ");
        int num = scan.nextInt();
        List<Integer> res = FindFibonacciNumber(num);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
        scan.close();
    }
}
