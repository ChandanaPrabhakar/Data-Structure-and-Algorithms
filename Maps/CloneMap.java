package Maps;
import java.util.*;

public class CloneMap {
    public static void main(String[] args){
        Map<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "Violet");
        hashMap1.put(2,"Indigo");
        hashMap1.put(3, "Blue");
        hashMap1.put(4, "Green");
        hashMap1.put(5, "Yellow");
        hashMap1.put(6, "Orange");
        hashMap1.put(7, "Red");

        System.out.println("Original map: "+ hashMap1);

        Map<Integer, String> hashMap2 = new HashMap<>(hashMap1);
        System.out.println("Cloned Map: "+hashMap2);
    }
}
