package LinkedList;
import java.util.*;

public class PeekLastElement {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Green");
        linkedList.add("Yellow");
        linkedList.add("Orange");
        linkedList.add("Red");

        System.out.println("Peek last element: "+linkedList.peekLast());
        System.out.println("List: "+linkedList);
    }
}
