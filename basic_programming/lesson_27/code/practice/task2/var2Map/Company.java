package code.practice.task2.var2Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


        // Создаем коллекцию Map в которой в качестве ключа будет отдел,
        // а значением будет выступать список (List) сотрудников этого отдела

        Map<Department, List<Employee>> departmentEmployees = new HashMap<>();
        departmentEmployees.put(department1, new ArrayList<>());
        departmentEmployees.put(department2, new ArrayList<>());

        // после этого в нашей коллекции будет две записи - по количеству департаментов
        // но в значениях пока пустые списки

        // теперь распределим сотрудников по отделам


        List<Employee> employeesFromDepartment1 = departmentEmployees.get(department1);
        employeesFromDepartment1.add(employees.get(0));
        employeesFromDepartment1.add(employees.get(2));

        List<Employee> employeesFromDepartment2 = departmentEmployees.get(department2);
        employeesFromDepartment2.add(employees.get(1));
        employeesFromDepartment2.add(employees.get(3));
        employeesFromDepartment2.add(employees.get(4));


        //System.out.println(departmentEmployees);



    }
}
