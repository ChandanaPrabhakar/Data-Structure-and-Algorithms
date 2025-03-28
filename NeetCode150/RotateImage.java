package NeetCode150;
import java.util.*;

public class RotateImage {
    public static void rotate(int[][]matrix){
        int n = matrix.length;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temporaryVariable = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temporaryVariable;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                int temporaryVariable = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temporaryVariable;
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

        rotate(matrix);

        System.out.println("\nRotated Matrix:");
        printMatrix(matrix);
        scan.close();
    }
}
