package SlidingWindow;
import java.util.*;

public class SumMaxMinInEveryWindowK {
    public static List<Integer> sumMaxMinNumber(int[] array, int size, int k){
        List<Integer> result = new ArrayList<>();
        Deque<Integer> maxQueue = new LinkedList<>();
        Deque<Integer> minQueue = new LinkedList<>();
        int sum = 0;

        for(int i = 0; i < k; i++){
            while(!maxQueue.isEmpty() && array[maxQueue.peekLast()] <= array[i]) maxQueue.pollLast();
            maxQueue.addLast(i);
            while(!minQueue.isEmpty() && array[minQueue.peekLast()] >= array[i]) minQueue.pollLast();
            minQueue.addLast(i);
        }
        sum = array[maxQueue.peekFirst()] + array[minQueue.peekFirst()];
        result.add(sum);

        for(int i = k; i < size; i++){
            if(!maxQueue.isEmpty() && maxQueue.peekFirst() == i - k) maxQueue.pollFirst();
            while(!maxQueue.isEmpty() && array[maxQueue.peekLast()] <= array[i]) maxQueue.pollLast();
            maxQueue.addLast(i);

            if(!minQueue.isEmpty() && minQueue.peekFirst() == i - k) minQueue.pollFirst();
            while(!minQueue.isEmpty() && array[minQueue.peekLast()] >= array[i]) minQueue.pollLast();
            minQueue.addLast(i);

            sum = array[maxQueue.peekFirst()] + array[minQueue.peekFirst()];
            result.add(sum);
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
        System.out.println("the sum of maximum and minimum numbers in every subarray of size K: ");
        List<Integer> result = sumMaxMinNumber(array, size, k);
        System.out.println(result);
        scan.close();
    }
}
