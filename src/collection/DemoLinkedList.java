package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class DemoLinkedList {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.addLast("Cherry");
        list.addFirst("Apricot");

        System.out.println("Original list: " + list);

        // Accessing an element (less efficient than ArrayList)
        String firstElement = list.getFirst();
        System.out.println("First element: " + firstElement);

        // Removing an element
        list.remove("Banana");
        list.removeFirst();
        System.out.println("List after removal: " + list);

        Iterator<String> descendingIterator = list.descendingIterator();

        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }

        list.push("new");
        System.out.println(list);
        System.out.println("list.pop(): "+list.pop());
    }


}
