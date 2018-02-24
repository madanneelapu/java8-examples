//reduce using streams
package streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        Stream<Integer> numberStream = numbers.stream();

        int sum = numberStream.reduce(0,(a,b) -> a+b);
        System.out.println(sum);

        numberStream = numbers.stream();
        int pdtOfEvens = numberStream.reduce(1, (a,b) -> {
            if(b%2==0) return a*b; else return a;
        });

        System.out.println(pdtOfEvens);
    }
}
