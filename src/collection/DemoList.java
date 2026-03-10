package collection;

import oops.objectclass.Laptop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {

    public static void main(String[] args) {

        List list = new ArrayList();

        ArrayList arrayList = new ArrayList();
        arrayList.add(5);
        arrayList.add(55);
        arrayList.add("name");
        arrayList.add(new Laptop(8, "intel", false));

        System.out.println(arrayList.get(3));

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        arrayList.set(2, 44);

        System.out.println("Iterator flow");

        Iterator itr = arrayList.iterator();
        System.out.println(itr.next());

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        List.of(1,2,3,4,5,6,7,8,9,1,2,3,54,4);

        of(1);
        of(1,2);
        of(1,2,3);

        // Generics
        List<Laptop> laptops = new ArrayList<Laptop>();
        laptops.add(new Laptop(8, "intel", false));
//        laptops.add(98);

        laptops.get(0).setFingerUnlockAvailable(true);
        System.out.println(laptops.get(0));
    }

    static void of(long... elements) {
        System.out.println("elements: " + elements);
    }

    List<Laptop> getList(ArrayList<Laptop> laptops) {
        return laptops;
    }

}
