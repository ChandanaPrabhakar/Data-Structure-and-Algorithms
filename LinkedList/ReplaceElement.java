package LinkedList;
import java.util.*;

public class ReplaceElement {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Green");
        linkedList.add("Yellow");
        linkedList.add("Orange");
        linkedList.add("Red");

        linkedList.set(1, "Black");

        System.out.println(linkedList);
    }
    
}
