package Variant3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Department {
    private String departmentName;
    private List<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
    public Boolean removeEmployee(Employee employee) {
        return employees.remove(employee);
    }

    public Employee findEmployeeByName(String firstName, String lastName) {
        for (Employee emp : employees) {
            if (emp.getName().equals(firstName) && emp.getFamilyName().equals(lastName)) {
                return emp;
            }
        }
        return null;
    }

    public void addNewEmployee(Employee employee){
        if (employee != null) {
            employees.add(employee);
        }
    }
    public void deliteEmployee(Employee employee){
        Employee foundedEmployee = findEmployee(employee);
        if (!(foundedEmployee == null)){
            employees.remove(foundedEmployee);
        }
    }

    public Employee findEmployee(Employee employee) {
        Employee foundedEmployee = null;
        for (Employee employee1: employees){
            if (employee1.equals(employee)){
                foundedEmployee = employee1;
            }
        }
        return foundedEmployee;
    }

    public void updateRole(String name, String familyName, String department, String oldRole, String newRole) {
        Employee employeeToFind = new Employee(name, familyName, oldRole, department);
        for (Employee employee : employees) {
            if (employee.equals(employeeToFind)) {
                employee.setRole(newRole);
                System.out.println("The role was successfully updated" + employee);
            }
            else {
                System.out.println("There is no employee " + employeeToFind);
            }
        }
    }
    public void updateDepartment(String name, String familyName, String role, String olddepartment, String newDepartment ) {
        Employee employeeToFind = new Employee(name, familyName, role, olddepartment);
        for (Employee employee : employees) {
            if (employee.equals(employeeToFind)) {
                employee.setDepartment(newDepartment);
                System.out.println("The department was successfully updated" + employee);
            }
            else {
                System.out.println("There is no employee " + employeeToFind);
            }
        }
    }

    public List<Employee> findByName(String name) {
        List<Employee> foundedEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                foundedEmployees.add(employee);
            }
        }
        return foundedEmployees;
    }

    public List<Employee> findByFamilyName(String familyName) {
        List<Employee> foundedEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getFamilyName().equals(familyName)) {
                foundedEmployees.add(employee);
            }
        }
        return foundedEmployees;
    }

    public List<Employee> findByRole(String role) {
        List<Employee> foundedEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getRole().equals(role)) {
                foundedEmployees.add(employee);
            }
        }
        return foundedEmployees;
    }

    public List<Employee> findAll() {
        return new ArrayList<>(employees);
    }

}

