package streams;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsDemo6 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "madan", "neelapu", "DEV", "SE", 24000.00),
                new Employee(2, "raju", "mudunuri", "DEV", "VP", 25000.00),
                new Employee(3, "anand", "mudunuri", "ADMIN", "VP", 27000.00),
                new Employee(4, "swathi", "metta", "HR", "HR", 30000.00),
                new Employee(5, "murthy", "gsn", "DEV", "DBA", 26000.00),
                new Employee(5, "murthy", "gsn", "ADMIN", "DEVOPS", 26000.00)
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

        /*Map<String, List<Employee>> employeesByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        employeesByDept.forEach((dept, emps) -> {
            System.out.println(dept);
            emps.forEach(System.out::println);
            System.out.println("------------------------------------------------------");
        });*/

        System.out.println(employees.stream()
                .mapToDouble(emp -> emp.getSalary())
                .max());

    }
}


