package HashSet;

import java.util.HashSet;

public class CloneHashset {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");

        HashSet<String> set2 = new HashSet<>(set);

        System.out.println("The clones hash Set: "+set2);
    }
}
