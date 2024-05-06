package code.companyVer4;

import code.companyVer3.Department2;

import java.util.Arrays;

public class Company {
    public static void main(String[] args) {

        Employee[] employeesForDep1= new Employee[3];
        Employee[] employeesForDep2= new Employee[5];

        Department[] departments = new Department[2];


        departments[0] = new Department("Marketing", employeesForDep1);
        departments[1] = new Department("IT", employeesForDep2);


        System.out.println(Arrays.toString(departments));

        // заполнить список сотрудников

        employeesForDep1[0] = new Employee(1, "Ruslan");
        employeesForDep1[1] = new Employee(2, "Petr");
        employeesForDep1[2] = new Employee(3, "Ruslan");


        employeesForDep2[0] = new Employee(4,"Roman");

        System.out.println(Arrays.toString(departments));


    }

    public static void printCompanyData(Department department){
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
