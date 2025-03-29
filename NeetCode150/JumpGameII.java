package NeetCode150;

import java.util.Scanner;

public class JumpGameII {
    public static int jumpGameII(int[] array){
        int jump = 0, farthest = 0, end = 0;
        for(int i = 0; i < array.length - 1; i++){
            farthest = Math.max(farthest, i + array[i]);
            if(i == end){
                jump++;
                end = farthest;
            }
        }
        return jump;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Jump Game II: "+jumpGameII(array));
        scan.close();
    }
}
