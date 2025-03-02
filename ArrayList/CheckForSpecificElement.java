package ArrayList;
import java.util.*;

public class CheckForSpecificElement {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Violet");
        arrayList.add("Indigo");
        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Yellow");
        arrayList.add("Orange");
        arrayList.add("Red");

        if(arrayList.contains("Orange")){
            System.out.println("Element found in Array List");
        }else{
            System.out.println("Element is missing from Array List");
        }
    }
}
