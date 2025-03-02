package LinkedList;
import java.util.*;

public class IterateThroughList {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Green");
        linkedList.add("Yellow");
        linkedList.add("Orange");
        linkedList.add("Red");

        for(String color : linkedList){
            System.out.print(color+", ");
        }
    }
}
