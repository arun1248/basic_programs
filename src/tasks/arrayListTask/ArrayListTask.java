package tasks.arrayListTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayListTask {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<String>();
        tasks.add("Open 9 AM");
        tasks.add("Update gold rate");
        tasks.add("gold bracelet");
        tasks.add("gold necklace");
        tasks.add("gold haram");

        System.out.println("print list: "+tasks);

        System.out.println("Before insertion: "+tasks);
        tasks.add(2,"Check silver stock");
        System.out.println("After insertion: "+tasks);

        System.out.println("3rd item: "+tasks.get(2));
        tasks.set(2,"Serve customer");
        System.out.println("print list: "+tasks);

        System.out.println("Size of list before removal: "+tasks.size());
        tasks.remove(0);
        System.out.println("Size of list after removal: "+tasks.size());

        System.out.println("list.contains: "+tasks.contains("Update gold rate"));

        //intermediate level
        System.out.println("Print lists");
        for(String task : tasks)
        {
            System.out.println(task);
        }

        ArrayList<String> backup = new ArrayList<String>();
        backup.addAll(tasks);
        System.out.println("Backup: "+backup);

        Collections.sort(tasks);
        System.out.println("After sorting: "+tasks);

        Collections.reverse(tasks);
        System.out.println("After reversing: "+tasks);

        System.out.println("Sublist: "+tasks.subList(1,4));

        LinkedList<String> list = new LinkedList<>(tasks);
        System.out.println(list);
    }
}
