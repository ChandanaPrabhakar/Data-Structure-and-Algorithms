package Algorithms.BinarySearchProblems.Foundation;

public class SearchEmptyArray {
    public static void main(String[] args) {
        int[] arr = {};
        int target = 5;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }
        return -1;
    }
}
