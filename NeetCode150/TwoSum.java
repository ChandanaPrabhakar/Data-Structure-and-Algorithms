package NeetCode150;
import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] array, int size, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < size; i++){
            int remainder = target - array[i];
            if(map.containsKey(remainder)){
                return new int[]{map.get(remainder), i};
            }
            map.put(array[i], i);
        }
        return new int[]{};
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
        System.out.println("Enter target value: ");
        int target = scan.nextInt();
        int[] result = twoSum(array, size, target);

        if (result.length == 2) {
            System.out.println("Indices: " + Arrays.toString(result));
        } else {
                System.out.println("No solution found.");
        }
        scan.close();
    }
}
