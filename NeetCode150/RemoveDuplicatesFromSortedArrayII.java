package NeetCode150;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArrayII {
    public static int removeDuplicatesII(int[] array, int size){
        if(array.length <= 2) return array.length;
        int k = 2;

        for(int i = 2; i < size; i++){
            if(array[i] != array[k - 2]){
                array[k] = array[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array element: ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Removed value: "+removeDuplicatesII(array, size));
        scan.close();
    }
}
