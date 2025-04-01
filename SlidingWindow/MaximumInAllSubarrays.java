package SlidingWindow;
import java.util.*;

public class MaximumInAllSubarrays {
    public static List<Integer> maximumInSubarray(int[] array, int n, int k){
        List<Integer> result = new ArrayList<>();
        Deque<Integer> queue = new LinkedList<>();

        for(int i = 0; i < k; i++){
            while(!queue.isEmpty() && array[queue.peekLast()] <= array[i]){
                queue.pollLast();
            }
            queue.addLast(i);
        }

        for(int i = k; i < n; i++){
            result.add(array[queue.peekFirst()]);

            while(!queue.isEmpty() && queue.peekFirst() <= i - k){
                queue.pollFirst();
            }

            while(!queue.isEmpty() && array[queue.peekLast()] <= array[i]){
                queue.pollLast();
            }

            queue.addLast(i);
        }

        result.add(array[queue.peekFirst()]);
        
        return result;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int []array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Enter value of k: ");
        int k = scan.nextInt();
        System.out.println("Maximum in all subarrays of size k: ");
        List<Integer> result = maximumInSubarray(array, size, k);
        System.out.println(result);
        scan.close();
    }
}
