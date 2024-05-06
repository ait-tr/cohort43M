package code.companyVer5;

import code.library.var1.UserInput;

public class CompanyUtil {

    public void fillDepartment(Department department) {
        UserInput userInput = new UserInput();

        Employee[] employees = department.getEmployees();

        for (int i = 0; i < employees.length; i++) {
            int employeeId = userInput.inputInt("Введите номер сотрудника: ");
            String employeeName = userInput.inputText("Введите имя сотрудника: ");
            employees[i] = new Employee(employeeId,employeeName);
        }
    }

    public void printCompanyData(Department department){
        System.out.println("Отдел: " + department.getName());
        for (int i = 0; i < department.getEmployees().length; i++) {
            System.out.println("Сотрудник: ");

            Employee[] employees = department.getEmployees();
            Employee currentEmployee = employees[i];
            System.out.println("Имя: " + currentEmployee.getName());

            //System.out.println("Имя: " + department.getEmployees()[i].getName());

        }
    }
}
