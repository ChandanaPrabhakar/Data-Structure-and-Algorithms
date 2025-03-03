package ArrayList;
import java.util.*;

public class ReplaceSecondElement {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Violet");
        arrayList.add("Indigo");
        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Yellow");
        arrayList.add("Orange");
        arrayList.add("Red");

        arrayList.set(1, "Black");
        System.out.println(arrayList);
    }
}
