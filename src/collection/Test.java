package collection;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
        list.add("");
        list.add("");

        Stream<String> stream = list.stream()
                .filter(element -> {
                    System.out.println("element: " + element);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.out.println("InterruptedException");
                    }
                    return element.contains("d");
                });

        stream.toList();

        List<String> dev1Languages = Arrays.asList("Java", "Python", "C++");
        List<String> dev2Languages = Arrays.asList("JavaScript", "Java", "TypeScript");

        List<List<String>> combined = Arrays.asList(dev1Languages, dev2Languages);

        List<String> allLanguages = combined.stream()
                .flatMap(languages -> languages.stream())
                .distinct()
                .toList();
//                .collect(Collectors.toList());

        System.out.println("allLanguages");
        System.out.println(allLanguages);

        List<SuperAdmin> superAdmins = new ArrayList<>();
        List<String> users1 = List.of("raj", "raja");
        List<String> users2 = List.of("RAJ", "RAJA");

        superAdmins.add(new SuperAdmin(users1));
        superAdmins.add(new SuperAdmin(users2));

        var test = superAdmins.stream()
                .flatMap(superAdmin -> superAdmin.users.stream())
                .toList();

        System.out.println(test);


        List<Integer> integers = Arrays.asList(1, 1, 1);
        System.out.println(integers.stream().reduce((integer, integer2) -> integer + integer2));

        Integer reduced = integers.stream().reduce(23, (a, b) -> a + b);
        System.out.println(reduced);


        "sdafma".chars()
                .filter(c -> c == 'a')
                .forEach(c -> System.out.println((char) c));

        Stream<String> stream1 =
                Stream.of("a", "b", "c").filter(element -> element.contains("b"));
        Optional<String> anyElement = stream1.findAny();

//        Optional<String> firstElement = stream1.findFirst(); // IllegalStateException


        // Vertical flow
        List<String> lst = Arrays.asList("abc1", "abc2", "abc3");

        lst.stream()
                .filter(s -> {
                    System.out.println("filter: "+s);
                    return s.contains("2");
                })
                .map(s -> {
                    System.out.println("map: "+s);
                    return s;
                })
                .findFirst();


    }

}
