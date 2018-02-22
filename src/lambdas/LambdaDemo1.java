package lambdas;

@FunctionalInterface
interface MyFunInterface{
    public boolean isEven(int a);
}


class MyImplOne implements MyFunInterface{
    @Override
    public boolean isEven(int a) {
        return a%2 == 0;
    }
}

public class LambdaDemo1 {

    public static void main(String[] args) {

        MyFunInterface myFnIn = new MyImplOne();
        boolean isTrue = myFnIn.isEven(23);
        System.out.println(isTrue);


        MyFunInterface myFnIn2 = a -> a%2 == 0;
        boolean isTrue2 = myFnIn2.isEven(23);
        System.out.println(isTrue2);
    }
}


