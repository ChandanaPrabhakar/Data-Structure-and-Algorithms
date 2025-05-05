package HashSet;

import java.util.HashSet;

public class EmptyAnHashSet {
    public static void main(String args[]){
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");

        System.out.println("The original hash set: "+set);
        set.clear();
        System.out.println("The empty set: "+set);
    }
}
