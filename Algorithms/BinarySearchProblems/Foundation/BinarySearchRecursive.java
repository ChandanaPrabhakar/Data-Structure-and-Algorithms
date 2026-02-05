package Algorithms.BinarySearchProblems.Foundation;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 5;
        int result = binarySearch(arr, 0, arr.length, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] array, int left, int right, int target) {
        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] < target) {
            binarySearch(array, left, mid - 1, target);
        } else {
            binarySearch(array, mid + 1, right, target);
        }
        return -1;
    }
}
