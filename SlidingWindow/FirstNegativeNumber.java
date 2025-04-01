package SlidingWindow;
import java.util.*;

public class FirstNegativeNumber {
    public static List<Integer> firstNegativeNumber(int[] array, int size, int k){
        List<Integer> result = new ArrayList<>();
        Deque<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < k; i++){
            if(array[i] < 0){
                queue.addLast(i);
            }
        }

        for(int i = k; i < size; i++){
            if(!queue.isEmpty()){
                result.add(array[queue.peekFirst()]);
            }else{
                result.add(0);
            }

            if(!queue.isEmpty() && queue.peekFirst() <= i - k){
                queue.pollFirst();
            }

            if(array[i] < 0){
                queue.addLast(i);
            }
        }

        if(!queue.isEmpty()){
            result.add(array[queue.peekFirst()]);
        }else{
            result.add(0);
        }

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
        System.out.println("Firt negative number in subarray of size k: ");
        List<Integer> result = firstNegativeNumber(array, size, k);
        System.out.println(result);
        scan.close();
    }
}
