package ArrayList;
import java.util.*;

public class ReverseElementInArrayList {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Violet");
        arrayList.add("Indigo");
        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Yellow");
        arrayList.add("Orange");
        arrayList.add("Red");
        System.out.println("Original array list: "+arrayList);
        Collections.reverse(arrayList);
        System.out.println("Reversed array list: "+arrayList);
    }
}
