package NeetCode150;
import java.util.*;

public class LongestConsequtiveSequence {
    public static int longestConsecutive(int[] array) {
        Set<Integer> numberSet = new HashSet<>();
        for(int number : array){
            numberSet.add(number);
        }
        int longestStreak = 0;

        for(int number : array){
            if(!numberSet.contains(number - 1)){
                int currentNumber = number;
                int currentSteak = 1;
                while(numberSet.contains(currentNumber + 1)){
                    currentNumber++;
                    currentSteak++;
                }
                longestStreak = Math.max(longestStreak, currentSteak);
            }
        }
        return longestStreak;
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
        System.out.println("The longest consecutive sequence in an array: "+longestConsecutive(array));
        scan.close();
    }
}
