package HashSet;

import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");

        String[] array = new String[set.size()];
        set.toArray(array);
        System.out.println("The origimal hash set: "+set);

        for(String val : array){
            System.out.print(val+", ");
        }
    }
}
