package tasks.linkedListTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTask {

    public static void main(String[] args) {

        LinkedList<String> shopQueue = new LinkedList<String>();
        shopQueue.add("Nazrin");
        shopQueue.add("Inza");
        shopQueue.add("Faheem");
        shopQueue.add("Ismail");
        shopQueue.addFirst("VIP Cust");
        shopQueue.addLast("Walk-in");

        System.out.println("Print list: "+shopQueue);
        System.out.println("First element: "+shopQueue.getFirst());
        System.out.println("Last element: "+shopQueue.getLast());
        shopQueue.pollFirst(); //shopQueue.removal()
        System.out.println("after removal: "+shopQueue);
        System.out.println("contains: "+shopQueue.contains("Inza"));

        //intermediate
        shopQueue.add(2,"Barakath");
        System.out.println("After insertion: "+shopQueue);
        Iterator<String> it = shopQueue.descendingIterator();
        System.out.println("list in descending order");
        while(it.hasNext()){
            System.out.println(it.next());
        }

        ArrayList<String> arr = new ArrayList<>(shopQueue);
        System.out.println("ArrayList: "+arr);


    }
}
