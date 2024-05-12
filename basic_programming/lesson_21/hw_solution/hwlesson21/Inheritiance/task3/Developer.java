package hwlesson21.Inheritiance.task3;

import java.util.Arrays;

public class Developer extends Employee{
    private String[] projects;

    public Developer(String lastName, String name, String[] projects) {
        super(lastName, name);
        this.projects = projects;
    }

    public String[] getProjects() {
        return projects;
    }

    public void setProjects(String[] projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Developer{" + super.toString() +
                "projects=" + Arrays.toString(projects) +
                "} ";
    }
}
