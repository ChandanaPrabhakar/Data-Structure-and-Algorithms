package HashSet;

import java.util.HashSet;

public class NumberOfElements {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");

        System.out.println("The size of hash set: "+set.size());
    }
}
