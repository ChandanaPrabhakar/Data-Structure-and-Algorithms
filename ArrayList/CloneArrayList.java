package ArrayList;
import java.util.*;

public class CloneArrayList {
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

        ArrayList<String> clonedArrayList = new ArrayList<String>(arrayList);
        System.out.println("Colned array list: "+clonedArrayList);
    }
}
