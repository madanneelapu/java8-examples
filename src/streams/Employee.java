package streams;

public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private String department;
    private String jobtitle;
    private double salary;

    public Employee(int id, String firstname, String lastname, String department, String jobtitle, double salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = department;
        this.jobtitle = jobtitle;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDepartment() {
        return department;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", department='" + department + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
