package Algorithms.BinarySearchProblems.Foundation;

public class CountOccurrence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 2, 3, 3, 4, 5, 9 };
        int target = 2;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Frequency of elements " + result);
        }
    }

    public static int binarySearch(int[] array, int target) {
        int first = firstOccurrence(array, target);
        if (first == -1) {
            return 0;
        }

        int last = lastOccurrence(array, target);

        return last - first + 1;
    }

    public static int firstOccurrence(int[] array, int target) {
        int left = 0, right = array.length - 1, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (array[mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static int lastOccurrence(int[] array, int target) {
        int left = 0, right = array.length - 1, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (array[mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
