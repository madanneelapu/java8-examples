//This reference in Lambda vs AnonymousInnerClass
package lambdas;

interface Greeter{
    public void greet();
}


public class LambdaDemo7 {

    public void doGreet(Greeter g){
        g.greet();
    }

    public void executeLambda(){
        doGreet(() -> {
            System.out.println("From Lambda Expression");
            System.out.println(this); //refers to the object
        });
    }

    public void executeAnonymous(){
        doGreet(new Greeter() {
            @Override
            public void greet() {
                System.out.println("From Anonymous Inner class");
                System.out.println(this); //Refers to inner class
            }

            @Override
            public String toString(){
                return "Anonymous Inner class";
            }
        });
    }

    public static void main(String[] args) {
        LambdaDemo7 ld = new LambdaDemo7();

        ld.executeAnonymous();

        /*ld.doGreet(() -> {
            System.out.println("From Anonymous Inner class");
            System.out.println(this); //This reference is not accessible in a static context
        });*/
        ld.executeLambda();
    }

    @Override
    public String toString(){
        return "LambdaDemo7 Class";
    }
}
