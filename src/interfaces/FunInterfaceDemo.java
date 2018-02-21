package interfaces;

@FunctionalInterface
interface MyFunInterface{
    public boolean isEven(int a);
    public default void methOne(){

    }
    public static void methTwo(){

    }
}


/*class MyImplOne implements MyFunInterface{
    @Override
    public boolean isEven(int a) {
        return a%2 == 0;
    }
}*/

public class FunInterfaceDemo {

    public static void main(String[] args) {
       /* MyFunInterface myFnIn = new MyImplOne();
        boolean isTrue = myFnIn.isEven(23);
        System.out.println(isTrue);*/


        MyFunInterface myFnIn2 = new MyFunInterface() {
            @Override
            public boolean isEven(int a) {
                return a%2 == 0;
            }
        };

        boolean isTrue2 = myFnIn2.isEven(23);
        System.out.println(isTrue2);
    }
}
