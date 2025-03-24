package NeetCode150;
import java.util.*;

public class TopKFrequencyElement {
    public static int[] topKFrequent(int[] array, int size, int k){
        if( k == size){
            return array;
        }
        Map<Integer, Integer> count = new HashMap<>();
        for(int number: array){
            count.put(number , count.getOrDefault(number, 0)+1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
            (a,b) -> count.get(a) - count.get(b)
        );

        for (int num : count.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        int result[] = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = heap.poll();
        }
        return result;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array values: ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Enter the value of frequency k: ");
        int k = scan.nextInt();
        int[] result = topKFrequent(array, size, k);
        System.out.println("Return the k most frequent elements within the array: " + Arrays.toString(result));

        scan.close();
    }
}
