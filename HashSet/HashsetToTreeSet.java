package HashSet;

import java.util.*;

public class HashsetToTreeSet {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");

        Set<String> treeset = new TreeSet<>(set);
        System.out.println(treeset);
    }
}
