package SlidingWindow;
import java.util.*;

public class MaximumNumberOfWindowK {
    public static List<Integer> maximumNumber(int[] array, int size, int k){
        List<Integer> result = new ArrayList<>();
        Deque<Integer> queue = new LinkedList<>();

        for(int i = 0; i < k; i++){
            while(!queue.isEmpty() && array[queue.peekLast()] <= array[i]) queue.pollLast();
            queue.add(i);
        }

        result.add(array[queue.peekFirst()]);

        for(int i = k; i < size; i++){
            if (!queue.isEmpty() && queue.peekFirst() == i - k) queue.pollFirst();
            while(!queue.isEmpty() && array[queue.peekLast()] <= array[i]) queue.pollLast();
            queue.addLast(i);
            result.add(array[queue.peekFirst()]); 
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
        System.out.println("the maximum numbers in every subarray of size K: ");
        List<Integer> result = maximumNumber(array, size, k);
        System.out.println(result);
        scan.close();
    }
}
