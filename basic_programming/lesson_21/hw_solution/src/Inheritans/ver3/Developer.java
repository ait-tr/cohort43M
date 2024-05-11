package Inheritans.ver3;

import java.util.Arrays;

public class Developer extends Employee{
    private String[] projects;

    public Developer(String name, String surname, int numberOfEmployee, String[] projects) {
        super(name, surname, numberOfEmployee);
        this.projects = projects;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDeveloper{" +
                "projects=" + Arrays.toString(projects) +
                '}';
    }
}
