package hwlesson21.Inheritiance.task3;

import java.util.Arrays;

public class Manager extends Employee {
    private Employee[] employees;

    public Manager(String lastName, String name, Employee[] employees) {
        super(lastName, name);
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() +
                ", employees=" + Arrays.toString(employees) +
                "}";
    }
}