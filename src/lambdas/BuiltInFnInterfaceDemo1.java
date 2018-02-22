package lambdas;


import java.util.function.Predicate;

public class BuiltInFnInterfaceDemo1 {
    public static void main(String[] args) {
        Predicate<Integer> evenPredicate = a -> a%2 == 0;
        System.out.println(evenPredicate.test(20));
    }
}
