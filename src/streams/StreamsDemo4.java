//streams are lazy

package streams;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 1, 2, 3, 4, 5);


        System.out.println(
                numbers.stream().filter(StreamsDemo4::isGT3)
                        .filter(StreamsDemo4::isEven)
                        .map(StreamsDemo4::doubleIt)
                        .findFirst() //terminal function triggers the execution of intermediate functions. - Lazy Evaluation.
                        //Until then, the function pipeline is built; but not used.
                        //You are more efficient, not when you work faster; but when you dont work at all.
                        //However, while executing; the whole pipeline is executed for each element.                        
            
                        //Lazy Evaluation is possible only if the functions don't have side effects.
        );

    }

    public static boolean isGT3(int a) {
        System.out.println("inside isGT3 " + a);
        return a > 3;
    }

    public static boolean isEven(int a) {
        System.out.println("inside isEven " + a);
        return a % 2 == 0;
    }

    public static int doubleIt(int a) {
        System.out.println("inside doubleIt " + a);
        return a * 2;
    }
}
