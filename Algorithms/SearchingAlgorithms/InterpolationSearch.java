package Algorithms.SearchingAlgorithms;
import java.util.*;

public class InterpolationSearch {
    public static int interpolationSearchIteration(int array[], int size, int key){
        int low = 0, high = size - 1;
        int position = low + ((key - array[low]) * (high - low) / (array[high] - array[low]));

        if(array[position] > key){
            high = position + 1;
        }else if(array[position] < key){
            low = position - 1;
        }else if(array[position] == key){
            return position;
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
        System.out.println("Key is found in index: "+interpolationSearchIteration(array,size,key));
        scan.close();
    }
}