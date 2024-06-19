package code.HW42.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Mike", "Accounter"));
        employees.add(new Employee("Jack", "Accounter"));
        employees.add(new Employee("Anna", "SMM"));
        employees.add(new Employee("Danna", "Cleaner"));
        employees.add(new Employee("Vlad", "Cleaner"));
        employees.add(new Employee("Denis", "Manager"));
        employees.add(new Employee("Mike", "SMM"));

        Map<String, Long> employeesByDepartments = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));
        System.out.println(employeesByDepartments);
    }
}
