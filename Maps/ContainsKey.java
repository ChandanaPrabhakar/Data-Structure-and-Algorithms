package Maps;
import java.util.*;

public class ContainsKey {
    public static void main(String[] args){
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Violet");
        hashMap.put(2,"Indigo");
        hashMap.put(3, "Blue");
        hashMap.put(4, "Green");
        hashMap.put(5, "Yellow");
        hashMap.put(6, "Orange");
        hashMap.put(7, "Red");

        if(hashMap.containsKey(5)){
            System.out.println("Yes -"+ hashMap.get(5));
        }else{
            System.out.println("No");
        }

        if(hashMap.containsKey(8)){
            System.out.println("Yes - "+hashMap.get(8));
        }else{
            System.out.println("No");
        }
    }
}
