package LinkedList;
import java.util.*;

public class CloneLinkedList {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Green");
        linkedList.add("Yellow");
        linkedList.add("Orange");
        linkedList.add("Red");
        System.out.println("Original list: "+linkedList);

        LinkedList<String> cloneList = new LinkedList<String>(linkedList);
        System.out.println("Copied list: "+cloneList);

    }
}
