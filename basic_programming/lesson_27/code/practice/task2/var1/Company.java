package code.practice.task2.var1;

import java.util.ArrayList;
import java.util.List;

public class Company {
    public static void main(String[] args) {
        // Создаем список сотрудников

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1,"John"));
        employees.add(new Employee(2,"Bill"));
        employees.add(new Employee(3,"Robert"));
        employees.add(new Employee(4,"Olga"));
        employees.add(new Employee(5,"Maria"));


        // создаем отделы

        Department department1 = new Department("Development");
        Department department2 = new Department("Marketing");

        // распределить сотрудников по отделам

        department1.addEmployee(employees.get(0));
        department1.addEmployee(employees.get(2));
        department2.addEmployee(employees.get(1));
        department2.addEmployee(employees.get(3));
        department2.addEmployee(employees.get(4));

        // Создадим список всех отделов

        List<Department> departments = new ArrayList<>();
        departments.add(department1);
        departments.add(department2);

        // выводим информацию о сотрудниках в каждом отделе

        for (Department department : departments){
            System.out.println("Отдел: " + department.getName());
              for (Employee employee : department.getEmployees()){
                  System.out.println(employee);
              }
        }


    }
}
