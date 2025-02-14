package Algorithms.SearchingAlgorithms;
import java.util.*;

public class LinearSerach {
    public static int linearSearch(int[] array, int size, int key){
        for(int i = 0; i < size; i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int array[] = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Enter key: ");
        int key = scan.nextInt();
        System.out.println("Key found at index: "+linearSearch(array,size,key));
        scan.close();
    }
}
