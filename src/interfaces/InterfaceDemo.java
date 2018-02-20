package interfaces;

interface A{
    public void methOne();
    public default void methTwo(){
        System.out.println("Interface A - methTwo");
    }
}

interface B extends A{
    public default void methTwo(){
        System.out.println("Interface B - methTwo");
    }
    public void methThree();
}

interface C{
    public void methFour();
    public default void methTwo(){
        System.out.println("Interface A - methTwo");
    }
}

class ClassOne implements A{
    @Override
    public void methOne(){
        System.out.println("ClassOne - methOne");
    }

    @Override
    public void methTwo() {
        System.out.println("ClassOne - methTwo");
    }
}

class ClassTwo implements A{
    @Override
    public void methOne() {
        System.out.println("ClassTwo - methOne");
    }
}

class ClassThree implements B{
    @Override
    public void methOne() {
        System.out.println("ClassThree - methOne");
    }

    @Override
    public void methThree() {
        System.out.println("ClassThree - methThree");
    }
}

class ClassFour implements A,C{
    @Override
    public void methOne() {
        System.out.println("ClassFour - methOne");
    }

    @Override
    public void methFour() {
        System.out.println("ClassFour - methFour");
    }

    @Override
    public void methTwo() {
        System.out.println("ClassFour - methTwo");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
       /* A a1 = new ClassOne();
        a1.methTwo();

        a1 = new ClassTwo();
        a1.methTwo();*/

        B b = new ClassThree();
        b.methOne();
        b.methTwo();
        b.methThree();

       /* A a = new ClassFour();
        a.methOne();
        a.methTwo();
        C c = new ClassFour();
        c.methFour();
        c.methTwo();*/


    }
}
