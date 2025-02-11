package Arrays;

import java.util.*;

public class TestEqualityOfArray {
    public static boolean checkEqualityOfTwoArray(int size1, int array1[], int size2, int array2[]) {
        if (size1 != size2) {
            return false;
        }
        for (int i = 0; i < size1; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array1 size: ");
        int size1 = scan.nextInt();
        System.out.println("Enter array1 elements: ");
        int array1[] = new int[size1];
        for (int i = 0; i < size1; i++) {
            array1[i] = scan.nextInt();
        }
        System.out.println("Enter array2 size: ");
        int size2 = scan.nextInt();
        System.out.println("Enter array2 elements: ");
        int array2[] = new int[size2];
        for (int i = 0; i < size2; i++) {
            array2[i] = scan.nextInt();
        }
        System.out.println("Equality check: " + checkEqualityOfTwoArray(size1, array1, size2, array2));
        scan.close();
    }
}
