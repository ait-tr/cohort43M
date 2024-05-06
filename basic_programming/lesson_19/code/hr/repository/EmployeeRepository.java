package code.hr.repository;

import code.hr.entity.Applicant;
import code.hr.entity.Employee;

public class EmployeeRepository {
    private Employee[] employees;

    public EmployeeRepository(Employee[] employees) {
        this.employees = employees;
    }

    public void add(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
            System.out.println("База данных переполненна!");
        }
    }

    public Employee findByName(String name){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getPerson().getName().equals(name)) {
                return employees[i];
            }
        }
        return null;
    }

}
