package lambdas;

interface IntTester {
    public boolean test(int a);
}

class IntMethods {
    public static boolean isPrime(int a) {
        for (int i = 2; i <= a / 2; i++)
            if (a % i == 0)
                return false;

        return true;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
}


class MyIntNum{
    private int num;

    public MyIntNum(int num) {
        this.num = num;
    }

    public boolean isFactor(int divisor){
        return (this.num % divisor) == 0;
    }
}

public class MethodRefDemo1 {

    public static boolean numTest(IntTester intTester, int a) {
        return intTester.test(a);
    }



    public static void main(String[] args) {
        boolean prime = numTest(IntMethods::isPrime, 17); //static method reference
        System.out.println(prime);

        MyIntNum num8 = new MyIntNum(8);
        IntTester testerForNum8 = num8::isFactor; //instance method reference

        boolean factor = testerForNum8.test(2);
        if(factor){
            System.out.println("2 is factor of 8");
        }

       // IntTester intTester = MyIntNum::isFactor;


    }
}
