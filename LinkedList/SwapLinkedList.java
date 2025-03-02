package LinkedList;
import java.util.*;

public class SwapLinkedList {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Green");
        linkedList.add("Yellow");
        linkedList.add("Orange");
        linkedList.add("Red");

        Collections.swap(linkedList, 1, 3);
        System.out.println(linkedList);
    }
}
