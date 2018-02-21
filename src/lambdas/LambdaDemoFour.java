package lambdas;

import java.math.BigDecimal;

interface MyTester<T>{
    public boolean test(T a);
}


public class LambdaDemoFour {
    public static void main(String[] args) {

        MyTester<Integer> evenTester = a -> a%2 == 0;
        System.out.println(evenTester.test(20));

        MyTester<String> strLenTester = s -> s.length() >= 8;
        System.out.println(strLenTester.test("Sajix Software"));


        MyTester<Account> accountBalanceTester = acctObj -> acctObj.getAmount() > 10000.00;

        Account myAcct = new Account("madan",5000.00);
        System.out.println(accountBalanceTester.test(myAcct));
    }
}

class Account {
    private String name;
    private double amount;

    public Account(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}