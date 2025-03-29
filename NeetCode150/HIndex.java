package NeetCode150;
import java.util.*;

public class HIndex {
    public static int hIndex(int[] citation){
        Arrays.sort(citation);
        int n = citation.length;
        for(int i = 0; i < n; i++){
            if(citation[i] >= n - i){
                return n - i;
            }
        }
        return 0;
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
        System.out.println("h - Index: "+hIndex(array));
        scan.close();
    }
}
