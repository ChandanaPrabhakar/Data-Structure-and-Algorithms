package LeetCode;
import java.util.*;

public class ContainsDuplicateII {

    public static boolean hasDuplicateHashSet(int[] array, int size, int k){
        Set<Integer> entry = new HashSet<>();
        for(int i = 0; i < size; i++){
            if(entry.contains(array[i])){
                return true;
            }
            entry.add(array[i]);
            if(entry.size() > k){
                entry.remove(array[i - k]);
            }
        }
        return false;
    }

    public static boolean hasDuplicateMap(int[] array, int size, int k){
        Map<Integer, Integer> entry = new HashMap<>();
        for(int i = 0; i < size; i++){
            if(entry.containsKey(array[i]) && i - entry.get(array[i]) <= k){
                return true;
            }
            entry.put(array[i], i);
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Enter value of K: ");
        int k = scan.nextInt();
        System.out.println("Approach 1 -> using Map: "+hasDuplicateMap(array, size, k));
        System.out.println("Approach 2 -> using Hash Set: "+hasDuplicateHashSet(array, size, k));
        scan.close();
    }
}
