package Company2.company;

public class Department {
    private String departmentName;
    private Company2.company.Employee[] employees;
    private int employeeCount;

    public Department(String departmentName, int maxEmployees) {
        this.departmentName = departmentName;
        employees = new Company2.company.Employee[maxEmployees];
        employeeCount = 0;
    }

    public void addEmployee(Company2.company.Employee employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = employee;
            employeeCount++;
        } else {
            System.out.println("Невозможно добавить сотрудника. Достигнуто максимальное количество сотрудников в отделе.");
        }
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Company2.company.Employee[] getEmployees() {
        return employees;
    }
}