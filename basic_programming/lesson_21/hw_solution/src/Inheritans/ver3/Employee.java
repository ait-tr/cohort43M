package Inheritans.ver3;

public class Employee {
    private String name;
    private String surname;
    private int numberOfEmployee;

    public Employee(String name, String surname, int numberOfEmployee) {
        this.name = name;
        this.surname = surname;
        this.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numberOfEmployee=" + numberOfEmployee +
                '}';
    }
}
