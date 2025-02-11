package Arrays;
import java.util.*;

public class SumOfMatrices {
    public static void sumOfArrayMatrices(int rows, int columns, int[][]array1, int[][]array2){
        int[][]sum = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j =0; j < columns; j++){
                sum[i][j] = array1[i][j] + array2[i][j];
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j =0; j < columns; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = scan.nextInt();
        System.out.println("Enter number of columns: ");
        int columns= scan.nextInt();
        System.out.println("Enter array1 elements: ");
        int array1[][] = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                array1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter array2 elements: ");
        int array2[][] = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                array2[i][j] = scan.nextInt();
            }
        }
        System.out.println("Sum of 2 matrices is: ");
        sumOfArrayMatrices(rows, columns, array1, array2);
        scan.close();
    }
}
