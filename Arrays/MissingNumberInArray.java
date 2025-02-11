package Arrays;
import java.util.*;

public class MissingNumberInArray {
    public static int checkMissingNumberInArray(int array[], int totalNumber){
        int arraySum = 0;
        int sum = totalNumber * ( totalNumber + 1) / 2;

        for(int i = 0; i < array.length; i++){
            arraySum += array[i];
        }
        int missingNumber = sum - arraySum;
        return Math.abs(missingNumber);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total number: ");
        int totalNumber = scan.nextInt();
        int[] array = {1,3,4,5,6,7};
        System.out.println("Missing number is: "+checkMissingNumberInArray(array, totalNumber));
        scan.close();
    }
}
