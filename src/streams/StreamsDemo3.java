//map reduce using streams
package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo3 {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(7.0);
        numbers.add(18.0);
        numbers.add(10.0);
        numbers.add(24.0);
        numbers.add(17.0);
        numbers.add(5.0);

        Stream<Double> sqrtStream = numbers.stream().map(num -> Math.sqrt(num));
        //List<Double> sqrts = sqrtStream.collect(Collectors.toList());
        //System.out.println(sqrts);

        Double pdtOfSqrts = sqrtStream.reduce(1.0, (a,b) -> a*b);
        System.out.println(pdtOfSqrts);
    }
}
