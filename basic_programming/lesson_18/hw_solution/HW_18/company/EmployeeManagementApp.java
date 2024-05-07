package company;

import java.util.List;
import java.util.Scanner;

public class EmployeeManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название компании:");
        String companyName = scanner.nextLine();
        Company company = new Company(companyName);

        while (true) {
            System.out.println("Введите название отдела (или 'стоп' для завершения):");
            String departmentName = scanner.nextLine();
            if (departmentName.equals("стоп")) {
                break;
            }
            Department department = new Department(departmentName);
            System.out.println("Введите имена сотрудников отдела (или 'стоп' для завершения):");
            while (true) {
                String employeeName = scanner.nextLine();
                if (employeeName.equals("стоп")) {
                    break;
                }
                Employee employee = new Employee(employeeName);
                department.addEmployee(employee);
            }
            company.addDepartment(department);
        }


        System.out.println("Компания - " + company.getName());
        int departmentNumber = 1;
        for (Department department : company.getDepartments()) {
            System.out.print("Отдел №" + (company.getDepartments().indexOf(department) + 1) + " - " + department.getName() + " ");
            List<Employee> employees = department.getEmployees();
            for (Employee employee : employees) {
                System.out.print("сотрудник №" + (employees.indexOf(employee) + 1) + " - " + employee.getName() + " ");
            }
            System.out.println();
        }
    }
}
