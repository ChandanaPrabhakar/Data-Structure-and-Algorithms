package ArrayList;
import java.util.*;

public class RetrieveElementFromSpecificIndex {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Violet");
        arrayList.add("Indigo");
        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Yellow");
        arrayList.add("Red");
        
        System.out.println("Element at position 3: "+arrayList.get(3));
    }
}
