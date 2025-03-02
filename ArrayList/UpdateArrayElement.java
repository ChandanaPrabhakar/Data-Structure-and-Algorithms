package ArrayList;
import java.util.*;

public class UpdateArrayElement {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Violet");
        arrayList.add("Indigo");
        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Yellow");
        arrayList.add("Orange");
        arrayList.add("Red");

        arrayList.set(2, "Black");
        arrayList.set(5, "White");
        System.out.println(arrayList);
    }
}
