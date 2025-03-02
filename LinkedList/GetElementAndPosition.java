package LinkedList;
import java.util.*;

public class GetElementAndPosition {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Green");
        linkedList.add("Yellow");
        linkedList.add("Orange");
        linkedList.add("Red");

        for(int i = 0; i < linkedList.size(); i++){
            System.out.println("index "+i+": "+linkedList.get(i));
        }
    }
}
