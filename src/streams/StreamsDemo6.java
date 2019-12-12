package streams;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsDemo6 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "madan", "neelapu", "DEV", "SE", 24000.00, 30),
                new Employee(2, "raju", "mudunuri", "DEV", "VP", 25000.00, 40),
                new Employee(3, "anand", "mudunuri", "ADMIN", "VP", 27000.00, 45),
                new Employee(4, "swathi", "metta", "HR", "HR", 30000.00, 28),
                new Employee(5, "murthy", "gsn", "DEV", "DBA", 26000.00, 40),
                new Employee(5, "murthy", "gsn", "ADMIN", "DEVOPS", 26000.00, 50)
        );

        //employees.stream().forEach(System.out::println);

        /*employees.stream()
                .filter(emp -> emp.getSalary() > 25000)
                .filter(emp -> emp.getLastname().startsWith("m"))
                .forEach(System.out::println);*/

       /* employees.stream()
                .sorted( (emp1,emp2) -> emp1.getFirstname().compareTo(emp2.getFirstname()) )
                .forEach(System.out::println);*/

       /* employees.stream()
                .filter(emp -> emp.getLastname().contains("n"))
                .forEach(System.out::println);*/

        /*employees.stream()
                .map(emp -> emp.getFirstname())
                .distinct().sorted()
                .forEach(System.out::println);*/

       /* employees.stream()
                .map(Employee::getFirstname)
                .distinct().sorted()
                .forEach(System.out::println);*/

       /* List<String> empFirstNames = employees.stream()
                .map(Employee::getFirstname)
                .distinct().sorted()
                .collect(Collectors.toList());
        System.out.println(empFirstNames);*/

        /*employees.stream()
                .limit(2)
                .forEach(System.out::println);*/

       /* employees.stream()
                .skip(1)
                .limit(3)
                .forEach(System.out::println);*/

        /*System.out.println(employees.stream()
                .filter(emp -> emp.getDepartment().equalsIgnoreCase("DEV"))
                .count());*/

        /*System.out.println(employees.stream()
                .filter(emp -> emp.getDepartment().equalsIgnoreCase("DEV"))
                .mapToDouble(emp -> emp.getSalary())
                .sum());*/

       /*System.out.println(employees.stream()
                .mapToDouble(emp -> emp.getSalary())
                .max());*/

        // Collectors.toMap(keyFunction, valueFunction)
       // System.out.println(employees.stream().collect(Collectors.toMap(emp -> emp.getFirstname(), emp -> emp.getSalary())));
       // System.out.println(employees.stream().collect(Collectors.toMap(Employee::getFirstname, Employee::getSalary)));

        // Unmodifiable list
        /*List<Double> salaries = employees.stream()
        .map(Employee::getSalary)
        .collect(Collectors.toList());
        //.collect(Collectors.toUnmodifiableList()); // works with Java 9. Enforces immutability.

        //salaries.add(45000.00); //toUnmodifiable... will not allow this operation

        System.out.println(salaries);
        System.out.println(salaries.getClass());*/

        // Joining
       /* System.out.println(employees.stream()
        .filter(emp -> emp.getAge() > 30)
        .map(Employee::getFirstname)
        .map(String::toUpperCase)
        .collect(Collectors.joining(", ")));*/

        // Partitioning
        /*System.out.println(
                employees.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getAge() > 30)));*/


        // Grouping
       /* Map<Integer, List<Employee>> employeesByAge = employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge));

        employeesByAge.forEach((age, emps) -> {
            System.out.println(age);
            emps.forEach(System.out::println);
            System.out.println("------------------------------------------------------");
        });*/


        // Grouping + transforming(mapping)
       /* Map<Integer, List<String>> empNamesByAge = employees.stream()
                .collect(
                        Collectors.groupingBy(Employee::getAge,
                                Collectors.mapping(Employee::getFirstname, Collectors.toList()))
                );

        System.out.println(empNamesByAge);*/

       /* Map<Integer, Long> countByAge = employees.stream()
                .collect(
                        Collectors.groupingBy(Employee::getAge, Collectors.counting())
                );

        System.out.println(countByAge);*/

        // collecting and then : count , just before adding to bucket... transform the data
        /*Map<Integer, Integer> countByAge2 = employees.stream()
                .collect(
                        Collectors.groupingBy(Employee::getAge,
                               Collectors.collectingAndThen( Collectors.counting(), Long::intValue))
                );

        System.out.println(countByAge2);*/

        //maxBy - Employee who is maxBy age
       /* System.out.println(employees.stream()
        .collect(Collectors.maxBy(Comparator.comparing(Employee::getAge))));*/

        //minBy - Employee who is minBy age
      /*  System.out.println(employees.stream()
        .collect(Collectors.minBy(Comparator.comparing(Employee::getAge))));*/

        //maxBy - Employee's name who is maxBy age
        String result = employees.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(Employee::getAge)),
                        employeeOptional -> employeeOptional.map(Employee::getFirstname).orElse("")
                ));
        System.out.println(result);


    }
}


