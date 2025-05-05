package HashSet;

import java.util.*;

public class IterateThroughtSet {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");

        Iterator<String> value = set.iterator();
        while(value.hasNext()){
            System.out.print(value.next()+", ");
        }
    }
}
