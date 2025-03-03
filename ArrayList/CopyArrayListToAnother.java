package ArrayList;
import java.util.*;

public class CopyArrayListToAnother {
    public static void main(String[] args){
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Violet");
        arrayList1.add("Indigo");
        arrayList1.add("Blue");
        arrayList1.add("Green");

        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Yellow");
        arrayList2.add("Orange");
        arrayList2.add("Red");

        Collections.copy(arrayList1, arrayList2);
        System.out.println("Copied array list: "+arrayList1);
    }
}
