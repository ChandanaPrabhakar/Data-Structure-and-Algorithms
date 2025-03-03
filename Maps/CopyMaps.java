package Maps;

import java.util.*;

public class CopyMaps {
    public static void main(String[] args) {
        Map<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "Violet");
        hashMap1.put(2, "Indigo");
        hashMap1.put(3, "Blue");
        Map<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.put(4, "Green");
        hashMap2.put(5, "Yellow");
        hashMap2.put(6, "Orange");
        hashMap2.put(7, "Red");

        hashMap1.putAll(hashMap2);
        System.out.println(hashMap1);
    }

}
