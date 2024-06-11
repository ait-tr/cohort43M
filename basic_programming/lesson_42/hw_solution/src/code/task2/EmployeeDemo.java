package code.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John","IT");
        Employee employee2 = new Employee("Arnold","Menegment");
        Employee employee3 = new Employee("Kate","IT");
        Employee employee4 = new Employee("Jim","Menegment");
        Employee employee5 = new Employee("Sara","IT");

        List<Employee> employees = Arrays.asList(employee1,employee2,employee3,employee4,employee5);

        List<Employee> employeeList = employees.stream()
                .filter(x -> x.getDepartment().equals("IT"))
                .toList();

        System.out.println(employeeList);
        System.out.println("============================");

        Map<String, Long> stringListMap =employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println(stringListMap);


    }
}
