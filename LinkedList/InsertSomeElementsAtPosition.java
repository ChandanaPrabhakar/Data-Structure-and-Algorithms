package LinkedList;
import java.util.*;

public class InsertSomeElementsAtPosition {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Green");
        linkedList.add("Yellow");
        linkedList.add("Orange");
        linkedList.add("Red");

        LinkedList<String> temporaryLinkedList = new LinkedList<>();
        temporaryLinkedList.add("White");
        temporaryLinkedList.add("Black");

        linkedList.addAll(2 , temporaryLinkedList);

        System.out.println(linkedList);

    }
}
