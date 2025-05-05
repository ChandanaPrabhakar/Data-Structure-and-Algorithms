package HashSet;

import java.util.HashSet;

public class CheckForEmptySet {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");

        if(set.isEmpty()) {
            System.out.println("The hash set is empty!");
        } else {
            System.out.println("The hash set is not empty");
        }

        set.clear();

        if(set.isEmpty()) {
            System.out.println("The hash set is empty!");
        } else {
            System.out.println("The hash set is not empty");
        }
    }
}
