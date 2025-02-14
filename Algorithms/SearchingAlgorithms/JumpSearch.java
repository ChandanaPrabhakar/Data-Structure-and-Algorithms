package Algorithms.SearchingAlgorithms;
import java.util.*;

public class JumpSearch {
    public static int jumpSearch(int array[], int size, int key){
        int step = (int)(Math.sqrt(size));
        int previousStep = 0;
        while(step < size && array[Math.min(step, size) - 1] < key){
            previousStep = step;
            step += (int)Math.sqrt(size);

            if(previousStep >= size){
                return -1;
            }
        }
        for(int i = previousStep; i < Math.min(step,size); i++){
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
        System.out.println("Enter key element: ");
        int key = scan.nextInt();
        System.out.println("Element found at index: "+jumpSearch(array, size, key));
        scan.close();
    }
}
