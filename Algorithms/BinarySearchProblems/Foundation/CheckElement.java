package Algorithms.BinarySearchProblems.Foundation;

public class CheckElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9 };
        int target = 5;
        boolean result = binarySearch(arr, target);
        if (!result) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found found");
        }
    }

    private static boolean binarySearch(int[] array, int target) {
        int left = 0, right = array.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return true;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
