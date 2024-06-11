package Variant3;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Company {
    static Map<String, Department> departments;

    public Company() {
        departments = new HashMap<>();
    }


    public void addNewDepartment(String departmentName) {
        departments.put(departmentName, new Department(departmentName));
    }

    public void addDepartment(Department department){
        if (department != null && !departments.containsKey(department.getDepartmentName())) {
            departments.put(department.getDepartmentName(), department);
        } else {
            System.out.println("Department already exist");
        }
    }
    public Department findDepartment(String departmentName) {
        return departments.get(departmentName);
    }

    public boolean removeDepartment(String departmentName) {
        if (departments.containsKey(departmentName)) {
            departments.remove(departmentName);
            return true;
        }
        return false;
    }

    public void addEmployee(Employee employee, String departmentName) {
        Department dep = departments.get(departmentName);
        if (dep != null) {
            employee.setDepartment(departmentName);
            dep.addNewEmployee(employee);
        } else {
            System.out.println("Department not found");
        }
    }

    public void removeEmployee(String firstName, String lastName) {
        for (Department dep : departments.values()) {
            Employee toRemove = dep.getEmployees().stream()
                    .filter(e -> e.getName().equals(firstName) && e.getFamilyName().equals(lastName))
                    .findFirst().orElse(null);
            if (toRemove != null) {
                dep.removeEmployee(toRemove);
                break;
            }
        }
    }

    public List<Employee> getEmployeesByDepartment(String name) {
        Department dep = departments.get(name);
        return dep != null ? dep.getEmployees() : new ArrayList<>();
    }
    public Department addNewDepartmet(String departmentName){
        Department newDepartment = new Department(departmentName);
        if (!departments.containsKey(departmentName)) {
            departments.put(departmentName, newDepartment);
        }
        else {
            System.out.println("Error: The department already existed");
        }
        return newDepartment;
    }

    public void addEmployee(String departmentName, Employee employee) {
        Department department = departments.get(departmentName);
        if (department != null) {
            department.addNewEmployee(employee);
        }
    }

    public Department addEmployeeToDepartment(String departmentName, Employee employee){
        Department department = departments.get(departmentName);
        if (department != null) {
            department.addNewEmployee(employee);
        } else {
            System.out.println("Error: there is no such department");
        }
        return department;
    }

    public void removeEmployee(String departmentName, Employee employee) {
        Department department = departments.get(departmentName);
        if (department != null) {
            department.deliteEmployee(employee);
        } else {
            System.out.println("Error: there is no such department");
        }
    }

    public void transferEmployee(Employee employee, String fromDeptName, String toDeptName) {
        Optional<Department> fromDept = Optional.ofNullable(departments.get(fromDeptName));
        Optional<Department> toDept = Optional.ofNullable(departments.get(toDeptName));

        if (!fromDept.isPresent() || !toDept.isPresent()) {
            System.out.println("Error: One or both departments not found.");
            return;
        }

        if (fromDept.get().removeEmployee(employee)) {
            toDept.get().addNewEmployee(employee);
            System.out.println("Employee " + employee.getName() + " successfully transferred from '" + fromDeptName + "' to '" + toDeptName + "'.");
        } else {
            System.out.println("Error: Employee " + employee.getName() + " not found in '" + fromDeptName+ "'.");
        }
    }
//    public void updateRole(String name, String familyName, String department, String oldRole, String newRole) {
//        Employee employeeToFind = new Employee(name, familyName, oldRole, department);
//        for (Employee employee : employees) {
//            if (employee.equals(employeeToFind)) {
//                employee.setRole(newRole);
//                System.out.println("The role was successfully updated" + employee);
//            }
//            else {
//                System.out.println("There is no employee " + employeeToFind);
//            }
//        }
//    }
//
//    public void updateDepartment(String name, String familyName, String role, String olddepartment, String newDepartment ) {
//        Employee employeeToFind = new Employee(name, familyName, role, olddepartment);
//        for (Employee employee : employees) {
//            if (employee.equals(employeeToFind)) {
//                employee.setDepartment(newDepartment);
//                System.out.println("The department was successfully updated" + employee);
//            }
//            else {
//                System.out.println("There is no employee " + employeeToFind);
//            }
//        }
//    }
//
//    public List<Employee> findByName(String name) {
//        List<Employee> foundedEmployees = new ArrayList<>();
//        for (Employee employee : employees) {
//            if (employee.getName().equals(name)) {
//                foundedEmployees.add(employee);
//            }
//        }
//        return foundedEmployees;
//    }
//
//    public List<Employee> findByFamilyName(String familyName) {
//        List<Employee> foundedEmployees = new ArrayList<>();
//        for (Employee employee : employees) {
//            if (employee.getFamilyName().equals(familyName)) {
//                foundedEmployees.add(employee);
//            }
//        }
//        return foundedEmployees;
//    }
//
//    public List<Employee> findByRole(String role) {
//        List<Employee> foundedEmployees = new ArrayList<>();
//        for (Employee employee : employees) {
//            if (employee.getRole().equals(role)) {
//                foundedEmployees.add(employee);
//            }
//        }
//        return foundedEmployees;
//    }
//
//    public List<Employee> findAll() {
//        return new ArrayList<>(employees);
//    }
//    public Employee addNewEmployee(String name, String familyName, String role, String department) {
//        Employee newEmployee = new Employee(name, familyName, role, department);
//        employees.add(newEmployee);
//        return newEmployee;
//    }
//
//
//    public Employee addNewEmployee(Employee employee){
//        employees.add(employee);
//        return employee;
//    }
//
//
//    public void deliteEmployee(Employee employee){
//        Employee foundedEmployee = findEmployee(employee);
//        if (!(foundedEmployee == null)){
//            employees.remove(foundedEmployee);
//        }
//    }
//
//    public Employee findEmployee(Employee employee) {
//        Employee foundedEmployee = null;
//        for (Employee employee1: employees){
//            if (employee1.equals(employee)){
//                foundedEmployee = employee1;
//            }
//        }
//        return foundedEmployee;
//    }
//
//    public void updateRole(String name, String familyName, String department, String oldRole, String newRole) {
//        Employee employeeToFind = new Employee(name, familyName, oldRole, department);
//        for (Employee employee : employees) {
//            if (employee.equals(employeeToFind)) {
//                employee.setRole(newRole);
//                System.out.println("The role was successfully updated" + employee);
//            }
//            else {
//                System.out.println("There is no employee " + employeeToFind);
//            }
//        }
//    }
//
//    public void updateDepartment(String name, String familyName, String role, String olddepartment, String newDepartment ) {
//        Employee employeeToFind = new Employee(name, familyName, role, olddepartment);
//        for (Employee employee : employees) {
//            if (employee.equals(employeeToFind)) {
//                employee.setDepartment(newDepartment);
//                System.out.println("The department was successfully updated" + employee);
//            }
//            else {
//                System.out.println("There is no employee " + employeeToFind);
//            }
//        }
//    }
//
//    public List<Employee> findByName(String name) {
//        List<Employee> foundedEmployees = new ArrayList<>();
//        for (Employee employee : employees) {
//            if (employee.getName().equals(name)) {
//                foundedEmployees.add(employee);
//            }
//        }
//        return foundedEmployees;
//    }
//
//    public List<Employee> findByFamilyName(String familyName) {
//        List<Employee> foundedEmployees = new ArrayList<>();
//        for (Employee employee : employees) {
//            if (employee.getFamilyName().equals(familyName)) {
//                foundedEmployees.add(employee);
//            }
//        }
//        return foundedEmployees;
//    }
//
//    public List<Employee> findByRole(String role) {
//        List<Employee> foundedEmployees = new ArrayList<>();
//        for (Employee employee : employees) {
//            if (employee.getRole().equals(role)) {
//                foundedEmployees.add(employee);
//            }
//        }
//        return foundedEmployees;
//    }
//
//    public List<Employee> findAll() {
//        return new ArrayList<>(employees);
//    }
public void printCompanyReport() {
    System.out.println("Company Report:");
    if (departments.isEmpty()) {
        System.out.println("No departments in the company.");
    } else {
        for (String deptName : departments.keySet()) {
            Department department = departments.get(deptName);
            System.out.println("\nDepartment: " + department.getDepartmentName());
            List<Employee> employees = department.getEmployees();
            if (employees.isEmpty()) {
                System.out.println("  No employees in this department.");
            } else {
                for (Employee emp : employees) {
                    System.out.println("  - " + emp.getName());
                }
            }
        }
    }
}
}
