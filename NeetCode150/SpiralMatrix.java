package NeetCode150;
import java.util.*;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][]matrix){
        List<Integer> result = new ArrayList<>();
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
        while(left <= right && top <= bottom){
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;

            if(left < right){
                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(top < bottom){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values of Rows and Columns: ");
        int row = scan.nextInt();
        int column = scan.nextInt();
        System.out.println("Enter the elements of matrix: ");
        int[][] matrix = new int[row][column];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("Spiral entry of matrix: "+spiralOrder(matrix));
        scan.close();
    }
}
