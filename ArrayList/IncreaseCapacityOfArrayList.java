package ArrayList;
import java.util.*;

public class IncreaseCapacityOfArrayList {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Violet");
        arrayList.add("Indigo");
        arrayList.add("Blue");
        arrayList.add("Green");

        arrayList.ensureCapacity(7);
        arrayList.add("Yellow");
        arrayList.add("Orange");
        arrayList.add("Red");

        System.out.println(arrayList);

    }
}
