package code.practice.task1;

public class Employee {
    private String personalCode;
    private String name;
    private Department department;

    public Employee(String personalCode, String name, Department department) {
        this.personalCode = personalCode;
        this.name = name;
        this.department = department;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "personalCode=" + personalCode +
                ", name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
}
