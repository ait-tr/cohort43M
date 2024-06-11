package code.streamGroupingBy;

public class Employee {
    private String name;
    private String position;
    private String department;
    private Integer salary;

    public Employee(String name, String position, String department, Integer salary) {
        this.name = name;
        this.position = position;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
