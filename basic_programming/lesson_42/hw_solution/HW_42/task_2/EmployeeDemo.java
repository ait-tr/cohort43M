package HW_42.task_2;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDemo {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Anton", "management"));
        employeeList.add(new Employee("Liubov", "management"));
        employeeList.add(new Employee("Amanda", "management"));
        employeeList.add(new Employee("Gregory", "development"));
        employeeList.add(new Employee("Andrew", "development"));
        employeeList.add(new Employee("Aleksandr", "HR"));
        employeeList.add(new Employee("Rony", "development"));
        employeeList.add(new Employee("Ingvar", "development"));
        employeeList.add(new Employee("Mary", "HR"));

        /* Only counting
        Map<String, Long> departmentCount = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.counting()));

        departmentCount.forEach((department, count) ->
        System.out.println(department + ": " + count)); */



        Map<String, List<String>> departmentEmployees = employeeList.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.mapping(Employee::getName, Collectors.toList())
            ));


        departmentEmployees.forEach((department, employees) -> {
            System.out.println(department + ": " + employees.size() + " employees");
            System.out.println("Names: " + String.join(", ", employees));
        });


    }
}
