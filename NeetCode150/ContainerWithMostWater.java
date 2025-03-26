package NeetCode150;
import java.util.*;

public class ContainerWithMostWater {
    public static int maxArea(int[] height){
        int left = 0, right = height.length - 1, maximumArea = 0;
        while(left < right){
            int area = (right - left) * Math.min(height[left], height[right]);
            maximumArea = Math.max(area, maximumArea);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maximumArea;
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
        System.out.println("Container with most water: "+maxArea(array));
        scan.close();
    }
}
