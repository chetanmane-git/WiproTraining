package dayEight;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
    	LinkedList<String> fruits = new LinkedList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Add element at the beginning
        fruits.addFirst("Orange");

        // Add element at the end
        fruits.addLast("Grapes");

        // Remove an element
        fruits.remove("Banana");

        // Access elements
        System.out.println(fruits.get(1));
        System.out.println("First fruit: " + fruits.getFirst());
        System.out.println("Last fruit: " + fruits.getLast());

        // Iterate through the list
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}