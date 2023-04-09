package org.example.stream;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        Predicate<String> predicateString = (String a) -> {
            return !a.isEmpty();
        };
        Predicate<String> predicate = (a) -> !a.isEmpty();
        Predicate<String> predicate_2 = a -> !a.isEmpty();
        Predicate<String> predicate_3 = String::isEmpty;

        getStringStream()
                .filter(predicateString)
                .filter(predicate)
                .filter(predicate_2)
                .peek(System.out::println)
                .forEach(s -> System.out.println(s + "-"));


        var myStream = getStream();
        double aDouble = myStream.filter(z -> {
                    if (z > 10) return true;
                    else return false;
                })
                .peek(System.out::println)
                .collect(Collectors.averagingInt(y -> y));
        System.out.println(aDouble);

        //allMatch is a terminal operation
        List<String> names = Arrays.asList("Peter", "Paul", "Pascal");
        names.stream().parallel().allMatch(name -> name != null);

        switch (Integer.parseInt(args[1])) {
            case 0:
                var date = LocalDate.now();
                var b = false;
                break;
            case 1:
                b = true;
                date = LocalDate.now().plusDays(2);
                break;
        }

        //if (b) System.out.println(args[2]);
    }

    static Stream<Integer> getStream() {
        return Stream.of(2, 3, 5, 7, 11, 12, 13);
    }

    static Stream<String> getStringStream() {
        return Stream.of("stream", "in", "action");
    }
}
