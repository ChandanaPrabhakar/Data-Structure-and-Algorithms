package Patterns;
import java.util.*;

class Circle{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of radius: ");
        int radius = scan.nextInt();

        double dist;
        for(int i = 0; i <= 2 * radius; i++){
            for(int j = 0; j <= 2*radius; j++){
                dist = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));
                if(dist > radius - 0.5 && dist < radius + 0.5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}