package ArrayList;
import java.util.*;

public class ShuffleArrayList {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Violet");
        arrayList.add("Indigo");
        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Yellow");
        arrayList.add("Orange");
        arrayList.add("Red");

        System.out.println("Original Array List: "+arrayList);
        Collections.shuffle(arrayList);
        System.out.println("Shuffled Array List: "+arrayList);
    }
}
