package ArrayList;
import java.util.*;

public class AddElementToFirstPosition {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Violet");
        arrayList.add("Indigo");
        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Yellow");
        arrayList.add("Red");
        
        arrayList.addFirst("Black");

        System.out.println(arrayList);
    }
}
