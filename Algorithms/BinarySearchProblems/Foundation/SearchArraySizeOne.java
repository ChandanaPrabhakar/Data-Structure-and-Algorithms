package Algorithms.BinarySearchProblems.Foundation;

public class SearchArraySizeOne {
    public static void main(String[] args) {
        int[] arr = { 1 };
        int target = 1;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] array, int target) {
        if (array.length == 1) {
            if (array[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }
        return -1;
    }
}
