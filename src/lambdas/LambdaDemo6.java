//closures in lambda

package lambdas;


interface Processor {
    public void process();
}

public class LambdaDemo6 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        doProcess(() -> System.out.println(a + b));
    }

    public static void doProcess(Processor p) {
        System.out.println("executing the lambda...");
        p.process();
    }
}
