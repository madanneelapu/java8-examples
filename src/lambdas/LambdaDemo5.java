//Accessibility of Static, instance, local variables in lambdas
package lambdas;

interface MyFunc{
    int func(int n);
}

public class LambdaDemo5 {

    static int a = 10; //static variable
    int b = 20; //instance variable

    public void print(){
        int num = 0; //local variable

        MyFunc myLambda = n -> {
            int v = num + n + LambdaDemo5.a + this.b;
            LambdaDemo5.a++; //can modify a static variable
            this.b++; //can modify an instance variable
           // num++; //cannot modify a local variable
            return v;
        };

        System.out.println( myLambda.func(8) );
    }

    public static void main(String[] args) {
        LambdaDemo5 ld5 = new LambdaDemo5();
        ld5.print();
        System.out.println(ld5.b);
        System.out.println(LambdaDemo5.a);
    }
}
