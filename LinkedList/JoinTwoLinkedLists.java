package LinkedList;
import java.util.*;

public class JoinTwoLinkedLists {
    public static void main(String[] args){
        LinkedList<String> linkedList1 = new LinkedList<String>();
        linkedList1.add("Violet");
        linkedList1.add("Indigo");
        linkedList1.add("Blue");

        LinkedList<String> linkedList2 = new LinkedList<String>();
        linkedList2.add("Green");
        linkedList2.add("Yellow");
        linkedList2.add("Orange");
        linkedList2.add("Red");

        LinkedList<String> linkedList3 = new LinkedList<String>();
        linkedList3.addAll(linkedList1);
        linkedList3.addAll(linkedList2);

        System.out.println(linkedList3);
    }
}
