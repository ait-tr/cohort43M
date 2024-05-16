package code.practice.task1;

public class Employee {
    private Integer personalCode;
    private String name;
    private Integer departmentId;

    public Employee(Integer personalCode, String name, Integer departmentId) {
        this.personalCode = personalCode;
        this.name = name;
        this.departmentId = departmentId;
    }

    public Integer getPersonalCode() {
        return personalCode;
    }

    public String getName() {
        return name;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "personalCode=" + personalCode +
                ", name='" + name + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }
}
