package ArrayList;
import java.util.*;

public class Sublist {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Violet");
        arrayList.add("Indigo");
        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Yellow");
        arrayList.add("Orange");
        arrayList.add("Red");

        List<String> subArrayList = new ArrayList<String>();
        subArrayList = arrayList.subList(3,6);
        System.out.println("Sublist: "+subArrayList);
    }
}
