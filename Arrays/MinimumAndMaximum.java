package Arrays;

import java.util.*;

public class MinimumAndMaximum {
    static int minimumValue = 0, maximumValue = 0;

    public static int minimumandmaximum(int array[], int size) {
        maximumValue = array[0];
        minimumValue = array[0];
        for (int i = 0; i < size-1; i++) {
            if (i + 1 > size) {
                if (array[i] > maximumValue) {
                    maximumValue = array[i];
                }
                if (array[i] < minimumValue) {
                    minimumValue = array[i];
                }
            }

            if (array[i] > array[i + 1]) {
                if (array[i] > maximumValue) {
                    maximumValue = array[i];
                }
                if (array[i + 1] < minimumValue) {
                    minimumValue = array[i + 1];
                }
            }
            if (array[i] < array[i + 1]) {
                if (array[i] < minimumValue) {
                    minimumValue = array[i];
                }
                if (array[i + 1] > maximumValue) {
                    maximumValue = array[i + 1];
                }
            }
        }
        return minimumValue;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        minimumandmaximum(array, size);
        System.out.println("Minimum and Maximum values are: " + minimumValue + " and " + maximumValue);
        scan.close();
    }
}
