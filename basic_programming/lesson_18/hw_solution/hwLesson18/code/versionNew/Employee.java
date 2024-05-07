package versionNew;

public class Employee {
    String employeeName;
    String employeeLastName;
    String employeePatronymic;
    int employeeID;

    public Employee(String employeeName, String employeeLastName, String employeePatronymic, int employeeID) {
        this.employeeName = employeeName;
        this.employeeLastName = employeeLastName;
        this.employeePatronymic = employeePatronymic;
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public String getEmployeePatronymic() {
        return employeePatronymic;
    }

    public int getEmployeeID() {
        return employeeID;
    }
}
