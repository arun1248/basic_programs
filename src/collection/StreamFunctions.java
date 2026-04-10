package collection;

import oops.objectclass.Laptop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFunctions {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<Laptop>();
        laptops.add(new Laptop(8, "intel", false));
        laptops.add(new Laptop(16, "intel", false));

        var value = laptops // data source
                .stream()
                .filter(laptop -> laptop.ram > 8) // intermediate operation returns stream
                .map(laptop -> {
                    laptop.isFingerUnlockAvailable = true;
                    return laptop;
                })
                .toList(); // terminal operation returns value

        System.out.println(value);

        Admin admin = new Admin("muthu", 34, 34);
        admin.getUser().displayDetails();

        laptops.stream()
                .filter(laptop -> laptop.ram > 8)
                .forEach(laptop -> System.out.println(laptop));

        System.out.println(
                laptops.stream()
                        .map(laptop -> laptop.ram)
                        .toList()
        );


        // Predicate, Function, Supplier and Consumer

        // Predicate, test() => takes one argument and returns a boolean
        // Function, apply() => takes one argument and returns any value
        // Consumer, accept() => takes a argument but returns nothing or void
        // Supplier, get()    => takes no argument but returns some value


        var allMatch = laptops.stream()
                .allMatch(laptop -> laptop.ram > 4);
        System.out.println("allMatch: " + allMatch);

        var anyMatch = laptops.stream()
                .anyMatch(laptop -> laptop.isFingerUnlockAvailable);
        System.out.println("anyMatch: " + anyMatch);

        System.out.println(laptops);


        var dropWhile = laptops.stream()
                .dropWhile(laptop -> laptop.ram == 8)
                .toList();

        System.out.println("dropWhile: " + dropWhile);


        var takeWhile = laptops.stream()
                .takeWhile(laptop -> laptop.ram == 8)
                .toList();

        System.out.println("takeWhile: " + takeWhile);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> result = numbers.stream()
                .takeWhile(n -> n < 5)
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
