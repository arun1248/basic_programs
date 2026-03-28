package collection;

import com.sun.source.tree.Tree;

import java.util.*;

public class DemoSetComparator {

    // Comparable is used for default sorting mechanism like which property or how to sort that specific type
    // Comparator is used to sort for specific use cases apart from default or common sorting provided by Comparable
    // Comparable and Comparator are both interfaces

    public static void main(String[] args) {

        List<Admin> adminList = new ArrayList<>();
        adminList.add(new Admin("name", 30, 14));
        adminList.add(new Admin("roja", 60, 22));
        adminList.add(new Admin("nazrin", 60, 26));
        adminList.add(new Admin("raja", 60, 12));


        AdminAgeSort ageSort = new AdminAgeSort();
        Collections.sort(adminList, ageSort);

        System.out.println("Collections.sort(adminList, ageSort): "+adminList);

        TreeSet<Admin> adminTreeSet = new TreeSet<>(ageSort);
        adminTreeSet.add(new Admin("roja", 60, 22));
        adminTreeSet.add(new Admin("name", 30, 14));
        adminTreeSet.add(new Admin("nazrin", 60, 26));
        adminTreeSet.add(new Admin("raja", 60, 12));

        System.out.println("new TreeSet<>(ageSort): "+adminTreeSet);

        TreeSet<Admin> adminTreeSetName = new TreeSet<>();
        adminTreeSetName.add(new Admin("roja", 60, 22));
        adminTreeSetName.add(new Admin("name", 30, 14));
        adminTreeSetName.add(new Admin("nazrin", 60, 26));
        adminTreeSetName.add(new Admin("raja", 60, 12));
        System.out.println("new TreeSet<>(): "+adminTreeSetName);

        ArrayList<Admin> list = new ArrayList<>(adminTreeSetName);
        Collections.sort(list, ageSort);
        System.out.println(list);


        new Admin("Name", 22,22); // anonymous object or nameless object
        Comparator c = new Comparator<Admin>() { // anonymous class, {} is used to give implementation and new is used to create the object for implementation

            @Override
            public int compare(Admin o1, Admin o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        Collections.sort(adminList, c);
        System.out.println(adminList);

        Comparator<Admin> c1 = (o1, o2) -> {
            if (o1.name.equals(o2.name))
                return 0;
            else if (o1.name.compareTo(o2.name) > 0)
                return 1;
            return -1;
        };

        Collections.sort(adminList, (o1, o2) -> {
            return o1.name.compareTo(o2.name);
        });

        Comparator<Admin> a = (Admin o1, Admin o2) -> { // anonymous function or method
            if (o1.age == o2.age)
                return 0;
            else if (o1.age > o2.age) {
                return 1;
            }
            return -1;
        };

    }

}

class AdminAgeSort implements Comparator<Admin> {
    @Override
    public int compare(Admin o1, Admin o2) {
        if (o1.age == o2.age)
            return 0;
        else if (o1.age > o2.age) {
            return 1;
        }
        return -1;
    }
}

