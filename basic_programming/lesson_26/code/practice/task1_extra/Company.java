package code.practice.task1_extra;

import java.util.ArrayList;

public class Company {

    public static void main(String[] args) {


        Department sales = new Department(1, "Sales");
        Department accounting = new Department(2, "Accounting");
        Department hr = new Department(3, "HR");

        ArrayList<Department> departments = new ArrayList<>();
        departments.add(sales);
        departments.add(accounting);
        departments.add(hr);

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("001", "Ruslan",sales));
        employees.add(new Employee("002", "Olga",accounting));
        employees.add(new Employee("003", "Roman",sales));
        employees.add(new Employee("004", "Victor",sales));
        employees.add(new Employee("005", "Anna",accounting));
        employees.add(new Employee("006", "Alina",hr));
        employees.add(new Employee("007", "James",sales));
        employees.add(new Employee("008", "Gunter",sales));
        employees.add(new Employee("009", "John",hr));
        employees.add(new Employee("010", "Robert",sales));
        employees.add(new Employee("011", "Oscar",accounting));


        System.out.println(employees);


        departments.remove(2);

        for (int i = 0; i < departments.size(); i++) {
            System.out.println(departments.get(i));
        }

        System.out.println("================ список сотрудников после удаления департамента ====");
        System.out.println(employees);


    }

}
