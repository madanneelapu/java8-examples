package lambdas;

interface Tester{
    public boolean test(int a);
}


public class LambdaDemoThree {
    public static void main(String[] args) {

        Tester evenTester = a -> a%2 == 0;
        System.out.println(evenTester.test(20));

        Tester primeTester = a -> {
            for(int i=2; i<= a/2; i++)
                if(a % i == 0)
                    return false;

            return true;
        };

        System.out.println(primeTester.test(26));
    }
}
