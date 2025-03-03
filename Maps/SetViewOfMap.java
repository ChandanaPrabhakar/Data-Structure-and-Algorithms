package Maps;
import java.util.*;

public class SetViewOfMap {
    public static void main(String[] args){
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Violet");
        hashMap.put(2,"Indigo");
        hashMap.put(3, "Blue");
        hashMap.put(4, "Green");
        hashMap.put(5, "Yellow");
        hashMap.put(6, "Orange");
        hashMap.put(7, "Red");

        Set<Map.Entry<Integer, String>> setView = hashMap.entrySet();

        System.out.println("Set view of mappings contained in map: "+setView);
    }
}
