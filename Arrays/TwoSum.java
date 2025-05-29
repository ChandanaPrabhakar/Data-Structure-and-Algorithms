package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args){
        int target = 9;
        int[] nums = {2,7,3,9};
        int[] result = indexOfSumOfTwoElements(nums, target);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int[] indexOfSumOfTwoElements(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
