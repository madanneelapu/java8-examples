package streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(65);
        numbers.add(51);
        numbers.add(25);
        numbers.add(9);
        numbers.add(98);

        Stream<Integer> numberStream = numbers.stream();

        numberStream.forEach(number -> System.out.println(number));
        numberStream.forEach(System.out::println);

    }
}
