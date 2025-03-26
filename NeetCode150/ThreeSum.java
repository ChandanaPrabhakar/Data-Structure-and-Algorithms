package NeetCode150;
import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] array){
        Arrays.sort(array);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < array.length - 2; i++){
            int left = i+1, right = array.length-1;
            if(i < 0 && array[i] == array[i+1]) continue;
            while(left < right){
                int sum = array[i] + array[left] + array[right];
                if(sum == 0){
                    result.add(Arrays.asList(array[i], array[left], array[right]));

                    while (left< right && array[left] == array[left + 1]) {
                        left++;
                    }

                    while (left < right && array[right] == array[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }else if(sum > 0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return result;
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
        List<List<Integer>> result = threeSum(array);
        System.out.println("three sum : "+result);
        scan.close();
    }
}
