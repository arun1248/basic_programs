package collection;

import oops.objectclass.Laptop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {

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

        List<String> ls = new ArrayList<>();
        ls.add("a");
        ls.add("b");
        System.out.println(ls);

        List<Integer> ls1 = new ArrayList<>();
        int no = 5;
        Integer i = 10;
        Integer.parseInt("10");

        Integer a = 100; // Autoboxing, uses Integer.valueOf(100)
        Integer b = 100; // Autoboxing, uses the same cached object
        System.out.println(a == b); // true

        Integer c = 200; // Value outside the default cache range
        Integer d = 200; // A new object is created
        System.out.println(c == d); // false

        int c1 = c; // Auto un-boxing
        System.out.println(c1);

        ls1.add(a);
        ls1.add(no);

        // Array vs ArrayList
        // Array: fixed size
        // Arraylist: dynamic size can shrink or grow

        System.out.println("Before add(1, 11): "+ls1);
        ls1.add(1, 11);
        System.out.println("After add(1, 11): "+ls1);

        System.out.println("Before remove(0): "+ls1);
        ls1.remove(0);
        System.out.println("After remove(0): "+ls1);


    }

    static void of(long... elements) {
        System.out.println("elements: " + elements);
    }

    List<Laptop> getList(ArrayList<Laptop> laptops) {
        return laptops;
    }

}
