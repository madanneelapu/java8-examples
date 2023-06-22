package optionals;

import java.util.List;
import java.util.Optional;

/*
* Optional is a container for an object.
* states:
* 1) Present: Contains an object
* 2) Empty: Does not contain an object
* */
public class OptionalDemo {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "madan", "neelapu", "DEV", "SE", 24000.00, 30);
        Employee e2 = new Employee(2, "raju", "mudunuri", "DEV", "VP", 25000.00, 40);

        Optional<Employee> employeeOptional = Optional.of(e1);

        Optional<Employee> employeeOptionalEmpty = Optional.empty();

        //public void ifPresent(Consumer<? super T> action)
        employeeOptional.ifPresent(e -> System.out.println(e));


        //void ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction)
        employeeOptionalEmpty.ifPresentOrElse(
                e -> System.out.println(e),
                () -> System.out.println("Employee not found")
        );

        //T orElse(@Nullable  T other)
        Employee emp = employeeOptional.orElse(e2);
        System.out.println(emp); //Returns e1

        emp = employeeOptionalEmpty.orElse(e2);
        System.out.println(emp); //Returns e2

        //emp = employeeOptionalEmpty.orElseThrow(() -> new RuntimeException("Employee not found"));
        //System.out.println(emp);


        /*Antipatterns:
            1) Don't use Optional as a method parameter. Instead, overload methods with needed arguments.
            2) Don't make properties of a class as Optional.
                It may lead to: non serializable exception
                If incase converted to JSON it may result in {"empty": true, "present": false}
                For example; lets say we are not sure if the employee name is present or null.
                Then use the Optional.isNullable(employee.getName()).isPresent(...)
            3) Refrain from using get(), isPresent(), isEmpty() as much as possible.
        */

        Employee e3 = new Employee(1, null, "neelapu", "DEV", "SE", 24000.00, 30);
        String firstName = Optional.ofNullable(e3.getFirstname()).orElse("FIRST_NAME");
        System.out.println(firstName);

        if(employeeOptional.isPresent()){
            emp = employeeOptional.get(); // If get() is called without isPresent() check; then it may lead to NoSuchElementException
            System.out.println(emp);
        }

        // T orElseGet(Supplier<? extends T> supplier )
        // If a value is present, returns the value, otherwise returns the result produced by the supplying function.
        employeeOptional.orElseGet(() -> new Employee());

        // Optional<T> or(@NotNull Supplier<? extends Optional<? extends T>> supplier )
        //If a value is present, returns an Optional describing the value, otherwise returns an Optional produced by the supplying function.
        employeeOptional.or(() -> Optional.of(e2));


        //public <U> Optional<U> map(@NotNull Function<? super T, ? extends U> mapper )
        //If a value is present, returns an Optional describing (as if by ofNullable)
        //the result of applying the given mapping function to the value, otherwise returns an empty Optional.
        //If the mapping function returns a null result then this method returns an empty Optional.
        Optional<String> empNameOpt = employeeOptional.map(Employee::getFirstname);

        // <U> Optional<U> flatMap(@NotNull Function<? super T, ? extends Optional<? extends U>> mapper )
        //If a value is present, returns the result of applying the given Optional-bearing mapping function to the value, otherwise returns an empty Optional.
        //This method is similar to map(Function), but the mapping function is one whose result is already an Optional, and if invoked, flatMap does not wrap it within an additional Optional.
        Optional<String> empNameOpt2 = employeeOptional.flatMap(e -> Optional.of(e.getFirstname()));


        // java.util.stream.Stream<T> stream()
        //If a value is present, returns a sequential Stream containing only that value, otherwise returns an empty Stream.
        List<Optional<Employee>> listOfOptionalEmployees = List.of(Optional.of(e1), Optional.empty(), Optional.of(e2));

        List<Employee> employeeList = listOfOptionalEmployees.stream() //Stream from list of Optional Employee
                                                            .flatMap(eOpt -> eOpt.stream()) //Convert each Optional Employee to a Stream; this is then flatMap-ed using the actual StreamsAPI method
                                                            .toList();

        // The above example converts the <list of optional employees> to a <list of employees>
        // The items whose optional is empty are ignored; as they return empty stream.

        System.out.println(employeeList);


    }
}
