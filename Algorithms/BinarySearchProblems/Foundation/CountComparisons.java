package Algorithms.BinarySearchProblems.Foundation;

public class CountComparisons {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 5;
        int result = binarySearch(arr, target);
        if (result == 0) {
            System.out.println("No Comparisons");
        } else {
            System.out.println("Number of comparisons " + result);
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length, count = 0;
        while (left <= right) {
            count++;
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return count;
            } else if (array[mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return count;
    }
}
