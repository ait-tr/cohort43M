package code.hr;

public class Employee {
    private int id;
    private Person person;
    private Department department;
    private String position;
    private int salary;


    public Employee(int id, Person person, Department department, String position, int salary) {
        this.id = id;
        this.person = person;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public Department getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", person=" + person +
                ", department=" + department +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
