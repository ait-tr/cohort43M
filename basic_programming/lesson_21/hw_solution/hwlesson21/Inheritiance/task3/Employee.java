package hwlesson21.Inheritiance.task3;

public class Employee {
    private String LastName;
    private String name;

    public Employee(String lastName, String name) {
        LastName = lastName;
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "LastName='" + LastName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
