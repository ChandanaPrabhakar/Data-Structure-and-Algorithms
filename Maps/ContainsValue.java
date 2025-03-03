package Maps;
import java.util.*;

public class ContainsValue {
    public static void main(String[] args){
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Violet");
        hashMap.put(2,"Indigo");
        hashMap.put(3, "Blue");
        hashMap.put(4, "Green");
        hashMap.put(5, "Yellow");
        hashMap.put(6, "Orange");
        hashMap.put(7, "Red");

        if(hashMap.containsValue("Yellow")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        if(hashMap.containsValue("Black")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
