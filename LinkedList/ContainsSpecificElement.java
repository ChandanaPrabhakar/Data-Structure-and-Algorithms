package LinkedList;
import java.util.*;

public class ContainsSpecificElement {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Green");
        linkedList.add("Yellow");
        linkedList.add("Orange");
        linkedList.add("Red");

        if(linkedList.contains("Orange")){
            System.out.println("Specified element exists");
        }else{
            System.out.println("Specified element is missing in the linked list");
        }
    }
}
