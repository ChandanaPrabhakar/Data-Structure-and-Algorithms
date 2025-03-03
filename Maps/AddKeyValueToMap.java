package Maps;
import java.util.*;

public class AddKeyValueToMap {
    public static void main(String[] args){
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Violet");
        hashMap.put(2,"Indigo");
        hashMap.put(3, "Blue");
        hashMap.put(4, "Green");
        hashMap.put(5, "Yellow");
        hashMap.put(6, "Orange");
        hashMap.put(7, "Red");

        for(Map.Entry<Integer, String> x : hashMap.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}
