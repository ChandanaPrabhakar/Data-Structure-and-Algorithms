package LinkedList;
import java.util.*;

public class IterateFromSpecificIndex {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Green");
        linkedList.add("Yellow");
        linkedList.add("Orange");
        linkedList.add("Red");

        Iterator<String> it = linkedList.listIterator(1);
        while(it.hasNext()){
            System.out.print(it.next()+", ");
        }
    }
}
