package NeetCode150;
import java.util.*;

public class TrappingRainWater {
    public static int trap(int[] height){
        int left = 0, right = height.length - 1, leftMax = 0, rightMax = 0, units = 0;
        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= leftMax){
                    leftMax = height[left];
                }else{
                    units += leftMax - height[left];
                }
                left++;
            }else{
                if(height[right] >= rightMax){
                    rightMax = height[right];
                }else{
                    units += rightMax - height[right];
                }
                right--;
            }
        }
        return units;
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
        System.out.println("Units of water trapped: "+trap(array));
        scan.close();
    }
}
