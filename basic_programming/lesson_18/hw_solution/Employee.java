package homework_18;

public class Employee {
    private int idEmployee;
    private String firstName;
    private String lastName;

    public Employee(int idEmployee, String firstName, String lastName) {
        this.idEmployee = idEmployee;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
