package LinkedList;
import java.util.*;

public class FirstAndLastOccurance {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Green");
        linkedList.add("Yellow");
        linkedList.add("Orange");
        linkedList.add("Red");

        String firstOccurence = linkedList.getFirst();
        System.out.println(firstOccurence);

        String lastOccurence = linkedList.getLast();
        System.out.println(lastOccurence);
    }
}
