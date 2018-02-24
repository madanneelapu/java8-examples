//streams basics
package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
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

        //numberStream.forEach(number -> System.out.println(number));
        //numberStream.forEach(System.out::println);

        //numberStream.sorted().forEach(System.out::println);

       // numberStream.sorted().filter(a -> a%2 == 0).forEach(System.out::println);

       List<Integer> evenNums =  numberStream.sorted().filter(a -> a%2 == 0).collect(Collectors.toList());
        System.out.println(evenNums);

        numberStream = numbers.stream();
        List<Integer> oddNums =  numberStream.sorted().filter(a -> a%2 == 1).filter(a -> a>25).collect(Collectors.toList());
        System.out.println(oddNums);

        System.out.println(numbers);
    }
}
