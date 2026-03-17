package collection;

import oops.objectclass.Laptop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListProgram {

    public static void main(String[] args) {

        // uses insertion order
        List<User> users = new ArrayList<>();
        users.add(new User("raja", 1, 15));
        users.add(new User("raju", 2, 25));
        users.add(new User("nazrin", 3, 25));
        users.add(new User("roja", 4, 5));


        boolean isUserPresent = users.contains(new User("roja", 4, 5));
        System.out.println(isUserPresent);


        User u1 = new User("nazrin", 3, 25);
        User u2 = new User("nazrin", 3, 25);

        System.out.println("u1.equals(u2): "+u1.equals(u2));
        System.out.println("u1.equals(Laptop): "+u1.equals(new Laptop(8, "intel", false)));

        List<User> users1 = new LinkedList<>(users);
        boolean isUserPresent1 = users.contains(new User("roja", 4, 5));
        System.out.println(isUserPresent1);


    }

}
