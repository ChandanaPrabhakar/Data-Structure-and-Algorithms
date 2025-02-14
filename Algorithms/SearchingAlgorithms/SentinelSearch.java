package Algorithms.SearchingAlgorithms;
import java.util.*;

public class SentinelSearch {
    public static int sentinelSearch(int array[], int size, int key){
        int lastElement = array[size-1];
        array[size - 1] = key;
        int i = 0;
        while(array[i] != key){
            i++;
        }
        array[size - 1] = lastElement;
        if(i < size - 1 || array[i] == key){
            return i;
        }else{
            return -1;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elemenst: ");
        int array[] = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Enter key element: ");
        int key = scan.nextInt();
        System.out.println("Key element found at index: "+sentinelSearch(array, size, key));
        scan.close();
    }
}
