package Inheritans.ver3;

import java.util.Arrays;

public class Manager extends Employee{
    private Employee[] employees;

    public Manager(String name, String surname, int numberOfEmployee, Employee[] employees) {
        super(name, surname, numberOfEmployee);
        this.employees = employees;
    }

    @Override
    public String toString() {
        return   "\nManager{" + super.toString() +
                "employees=" + Arrays.toString(employees) +
                '}';
    }
}
