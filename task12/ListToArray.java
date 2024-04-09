package task12;

import java.util.*;

public class ListToArray {
    public static void main(String[] args) {
        // Create a List
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");

        // Convert List to Array
        String[] array = new String[list.size()];
        list.toArray(array);

        // Print the Array elements
        System.out.println("Array elements:");
        for (String fruit : array) {
            System.out.println(fruit);
        }
    }
}
