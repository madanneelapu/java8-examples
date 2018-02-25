//properties of streams

package streams;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 10, 2, 1, 3, 4, 9, 5, 6, 4, 7, 8, 9, 6, 10);


        numbers.stream().distinct().sorted((e1,e2)->e2-e1).forEach(System.out::println);



    }


}
