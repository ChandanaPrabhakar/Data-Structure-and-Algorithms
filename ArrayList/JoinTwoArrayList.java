package ArrayList;
import java.util.*;

public class JoinTwoArrayList {
    public static void main(String[] args){
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Violet");
        arrayList1.add("Indigo");
        arrayList1.add("Blue");

        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Green");
        arrayList2.add("Yellow");
        arrayList2.add("Orange");

        ArrayList<String> arrayList3 = new ArrayList<String>();
        arrayList3.addAll(arrayList1);
        arrayList3.addAll(arrayList2);
        System.out.println("Joined array list: "+arrayList3);
    }
}
