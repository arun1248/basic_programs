package collection;

import oops.objectclass.Laptop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class StreamFunctions2 {

    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<Laptop>();
        laptops.add(new Laptop(8, "intel", false));
        laptops.add(new Laptop(16, "intel", false));

        laptops.stream()
                .filter(laptop -> laptop.ram > 8)
                .forEach(StreamFunctions2::display); // method reference

        laptops.stream()
                // laptop -> System.out.println(laptop)
                .forEach(System.out::println);

        laptops.forEach(System.out::println);

        List<Integer> list = Arrays.asList(2, 13, 4);
        // Lambda: n -> Math.sqrt(n)
        // Consumer method signature should match
        list.forEach(Math::sqrt);

        String str = "Hello World";
        // Lambda: () -> str.toUpperCase()
        Supplier<String> s = str::toUpperCase;
//        Consumer<String> c = str::compareTo;
        System.out.println(s.get());


        List<String> cities = Arrays.asList("Berlin", "Paris", "London");
        // Lambda: (s1, s2) -> s1.compareToIgnoreCase(s2)
        cities.sort(String::compareToIgnoreCase);
        System.out.println(cities);

        List<Employee> employees = new ArrayList<>();

        cities.stream()
                // constructor called with value of city
                // creates a new Employee object
                // passes the employee object down for processing
                .map(Employee::new)
                // takes the employee object from map and adding it to a list
                .forEach(employees::add);

        System.out.println(employees);

    }


    static void display(Laptop laptop) {
        // more code can be added
        laptop.process = laptop.process.toUpperCase();
        System.out.println(laptop);
    }

}
