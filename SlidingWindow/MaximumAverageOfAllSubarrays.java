package SlidingWindow;
import java.util.*;

public class MaximumAverageOfAllSubarrays {
    public static double maximumAverageOfAllSubarray(int[] array, int size, int k){
        double average = 0, maximumAverage = 0;
        int windowSum = 0; 

        for(int i = 0; i < k; i++){
            windowSum += array[i];
            average =(double) windowSum / k;
        }

        maximumAverage = Math.max(maximumAverage, average);

        for(int i = k; i < size; i++){
            windowSum += array[i] - array[i - k];
            average =(double) windowSum / k;
            maximumAverage = Math.max(maximumAverage, average);
        }
        return maximumAverage;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int []array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Enter value of k: ");
        int k = scan.nextInt();
        System.out.println("Maximum average of all subarrays of size k: ");
        double result = maximumAverageOfAllSubarray(array, size, k);
        System.out.println(result);
        scan.close();
    }
}
