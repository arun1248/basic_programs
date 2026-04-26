package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class StreamFunctions3 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
                .reduce(new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        System.out.println("i1 "+integer);
                        System.out.println("i2 "+integer2);
                        return 0;
                    }
                });

        // 1,2,3,4,5 -> data
        // apply(1, 2) -> 0 apply(1, 2) -> 1+2 = 3
        // apply(0, 3) -> 0 apply(3, 3) -> 3+3 = 6
        // apply(0, 4) -> 0 apply(6, 4) -> 6+4 = 10
        // apply(0, 5) -> 0 apply(10, 5) -> 10+5 = 15

        int sum = numbers.stream().reduce((a, b) -> a + b).get();
        System.out.println("sum: "+sum);

        int value = numbers.stream().reduce(10, (a, b) -> {
            System.out.println("a: "+a+" "+"b: "+b+" => "+(a+b));
            return a + b;
        });
        System.out.println("value: "+value);

        List<Integer> i = new ArrayList<>();
        System.out.println(i.stream().reduce(10,(a, b) -> a + b));
        System.out.println(i.stream().reduce((a, b) -> a + b));

        Optional<Integer> max = numbers.stream().reduce(Integer::max);

        max.ifPresent(val -> System.out.println("Max: " + val));

        max.ifPresent(System.out::println);

        List<String> wordList = Arrays.asList("Java", "8", "Streams");
        int totalLength = wordList.stream().reduce(
                0,                                   // Identity
                (sum1, word) -> sum1 + word.length(),  // Accumulator
                Integer::sum                         // Combiner (for parallel processing)
        );

        System.out.println("totalLength: "+totalLength);

//        var somevalue = wordList.parallelStream().reduce(
//                0,
//                (sum1, word) -> {
//                    System.out.println("sum1: " + sum1 + " " + "word: " + word + " => " + (sum1 + word.length()));
//                    return sum1 + word.length();
//                },
//                new BinaryOperator<Integer>() {
//                    @Override
//                    public Integer apply(Integer i1, Integer i2) {
//                        System.out.println("i1: "+i1+" i2: "+i2+" => "+(i1+i2));
//                        return i1+i2;
//                    }
//                }
//        );
//
//        System.out.println(somevalue);
    }
}
