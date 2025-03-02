package ArrayList;
import java.util.*;

public class RemoveThirdElement {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Violet");
        arrayList.add("Indigo");
        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Yellow");
        arrayList.add("Orange");
        arrayList.add("Red");

        arrayList.remove(2);
        System.out.println(arrayList);
    }
}
