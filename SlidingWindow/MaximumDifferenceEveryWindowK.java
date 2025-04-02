package SlidingWindow;
import java.util.*;

public class MaximumDifferenceEveryWindowK {
    public static List<Integer> maximumDifference(int[] array, int size, int k){
        List<Integer> result = new ArrayList<>();
        Deque<Integer> maxQueue = new LinkedList<>();
        Deque<Integer> minQueue = new LinkedList<>();

        for(int i = 0; i < k; i++){
            while(!maxQueue.isEmpty() && array[maxQueue.peekLast()] <= array[i]) maxQueue.pollLast();
            maxQueue.addLast(i);
            while(!minQueue.isEmpty() && array[minQueue.peekLast()] >= array[i]) minQueue.pollLast();
            minQueue.addLast(i);
        }
        
        result.add(array[maxQueue.peekFirst()] - array[minQueue.peekFirst()]);

        for(int i = k; i < size; i++){
            if(!maxQueue.isEmpty() && maxQueue.peekFirst() == i - k) maxQueue.pollFirst();
            while(!maxQueue.isEmpty() && array[maxQueue.peekLast()] <= array[i]) maxQueue.pollLast();
            maxQueue.addLast(i);

            if(!minQueue.isEmpty() && minQueue.peekFirst() == i - k) minQueue.pollFirst();
            while(!minQueue.isEmpty() && array[minQueue.peekLast()] >= array[i]) minQueue.pollLast();
            minQueue.addLast(i);

            result.add(array[maxQueue.peekFirst()] - array[minQueue.peekFirst()]);
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
        System.out.println("the difference between any two numbers in every subarray of size K: ");
        List<Integer> result = maximumDifference(array, size, k);
        System.out.println(result);
        scan.close();
    }
}
