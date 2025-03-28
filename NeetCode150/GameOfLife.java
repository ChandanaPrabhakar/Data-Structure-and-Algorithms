package NeetCode150;
import java.util.*;

public class GameOfLife {
    public static void gameOfLife(int[][] matrix){
        int m = matrix.length, n = matrix[0].length;
        int[] direction = {-1, 0, 1};

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int liveNeighbours = 0;
                for(int x : direction){
                    for(int y : direction){
                        if(x == 0 && y == 0) continue;

                        int r = i + x;
                        int c = j + y;

                        if (r >= 0 && r < m && c >= 0 && c < n && Math.abs(matrix[r][c]) == 1) {
                            liveNeighbours++;
                        }
                    }
                }

                if(matrix[i][j] == 1 && (liveNeighbours < 2 || liveNeighbours > 3)){
                    matrix[i][j] = -1;
                }else if(matrix[i][j] == 0 && liveNeighbours == 3){
                    matrix[i][j] = 2;
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] > 0){
                    matrix[i][j] = 1;
                }else{
                    matrix[i][j] = 0;
                }
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

        gameOfLife(matrix);

        System.out.println("\nRotated Matrix:");
        printMatrix(matrix);
        scan.close();
    }
}
