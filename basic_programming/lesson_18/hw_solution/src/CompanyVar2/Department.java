package CompanyVar2;

import java.util.Arrays;

public class Department {
    private String name;
    private Employee[] employees;


    public Department(String name, Employee[] employees ) {
        this.name = name;
        this.employees = employees;

    }

    public String getName() {
        return name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void setName(String name) {
        this.name = name;
    }
}
