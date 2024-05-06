package code.companyVer3;

import java.util.Arrays;

public class Department2 {

    private String name;
    private Employee[] employees;

    public Department2(String name, Employee[] employees) {

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
}
