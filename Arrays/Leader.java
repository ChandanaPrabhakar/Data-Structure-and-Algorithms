package Arrays;
import java.util.*;

public class Leader {
    public static void leaderOfArray(int[] array, int size){
        ArrayList<Integer> leaders = new ArrayList<>();
        int maximum = array[size-1];
        leaders.add(maximum);

        for(int i = size-2;i >= 0; i--){
            if(array[i] >= maximum){
                maximum = array[i];
                leaders.add(maximum);
            }
        }
        Collections.reverse(leaders);
        System.out.println("Leaders of array: "+leaders);
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
        leaderOfArray(array, size);
        scan.close();
    }
}
