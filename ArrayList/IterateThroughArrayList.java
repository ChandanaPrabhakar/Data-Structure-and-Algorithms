package ArrayList;
import java.util.*;

public class IterateThroughArrayList {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Violet");
        arrayList.add("Indigo");
        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Yellow");
        arrayList.add("Red");

        System.out.println("Iteration type 1");
        //iteration type 1
        for(String color : arrayList){
            System.out.println(color);
        }
        System.out.println();

        System.out.println("Traditional iteration");
        //traditional iteration
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}
