package NeetCode150;
import java.util.*;

public class SetZeroMatrix {
    public static void setZeroes(int[][] matrix){
        int m = matrix.length, n = matrix[0].length;
        boolean firstRowZero = false, firstColZero = false;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    if(i == 0) firstRowZero = true;
                    if(j == 0) firstColZero = true;

                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstRowZero){
            Arrays.fill(matrix[0], 0);
        }
        if(firstColZero){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values of rows and columns: ");
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        System.out.println("Enter matrix elements: ");
        int [][]matrix = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);

        setZeroes(matrix);

        System.out.println("\nRotated Matrix:");
        printMatrix(matrix);
        scan.close();
    }
}
