package Maps;

import java.util.HashMap;
import java.util.Map;

public class CheckIfEmpty {
    public static void main(String[] args){
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Violet");
        hashMap.put(2,"Indigo");
        hashMap.put(3, "Blue");
        hashMap.put(4, "Green");
        hashMap.put(5, "Yellow");
        hashMap.put(6, "Orange");
        hashMap.put(7, "Red");

        if(hashMap.isEmpty()){
            System.out.println("Map is Empty");
        }else{
            System.out.println("Map has key - value pairs");
        }

        hashMap.clear();

        if(hashMap.isEmpty()){
            System.out.println("Map is Empty");
        }else{
            System.out.println("Map has key - value pairs");
        }
    }
}
