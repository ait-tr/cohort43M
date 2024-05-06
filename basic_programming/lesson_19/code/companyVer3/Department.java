package code.companyVer3;

import java.util.Arrays;

public class Department {

    private String name;
    private Employee[] employees;

    public Department(String name, int quantityOfEmployee) {

        this.name = name;
        this.employees = new Employee[quantityOfEmployee];
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
