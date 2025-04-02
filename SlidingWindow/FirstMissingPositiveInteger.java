package SlidingWindow;
import java.util.*;

public class FirstMissingPositiveInteger {
    public static List<Integer> firstPositiveInteger(int[] array, int size, int k){
        List<Integer> result = new ArrayList<>();
        Deque<Integer> queue = new LinkedList<>();

        for(int i = 0; i < k; i++){
            if(!queue.isEmpty() && array[queue.peekLast()] <= k){
                queue.pollLast();
            }
            queue.addLast(i);
        }

        result.add(array[queue.peekFirst()]+ 1);

        for(int i = k; i < size; i++){
            if(!queue.isEmpty() && queue.peekLast() == i - k) queue.pollFirst();
            if(!queue.isEmpty() && array[queue.pollLast()] <= k) queue.pollLast();
            queue.addLast(i);

            result.add(array[queue.peekFirst()] + 1);
        }

        return result;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int [] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Enter window size: ");
        int k = scan.nextInt();
        System.out.println("Find the first positive integer missing in every subarray of size K: ");
        List<Integer> result = firstPositiveInteger(array, size, k);
        System.out.println(result);
        scan.close();
    }
}
