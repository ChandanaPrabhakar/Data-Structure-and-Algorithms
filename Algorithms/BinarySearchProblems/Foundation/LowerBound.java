package Algorithms.BinarySearchProblems.Foundation;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 5;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Index of lower bound element: " + result);
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1, ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] >= target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
