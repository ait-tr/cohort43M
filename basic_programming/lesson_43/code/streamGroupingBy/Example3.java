package code.streamGroupingBy;

import java.util.*;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        /*
        Класс Employee
        - сгруппировать по должностям
        - вычислить среднюю зарплату
        - получить список сотрудников с зп > 1000
        - найти всех сотрудников из отдела маркетинга и повысить им зп на 15%
        - найти сотрудников с самой низкой зп
        - найти сотрудников с самой высокой зп
         */

        Employee employee1 = new Employee("John", "Manager","Marketing", 1500);
        Employee employee2 = new Employee("Robert", "HR","HR", 900);
        Employee employee3 = new Employee("Alice", "Engineer","IT", 2000);
        Employee employee4 = new Employee("Roman", "Manager","Finance", 2000);
        Employee employee5 = new Employee("Charlie", "Developer","Marketing", 1700);



        List<Employee> staff = Arrays.asList(employee1,employee2,employee3,employee4,employee5);

        // сгруппировать по должности

        Map<String, List<Employee>> employeeByPosition = staff.stream()
                .collect(Collectors.groupingBy(employee -> employee.getPosition()));

        for (Map.Entry<String, List<Employee>> entry : employeeByPosition.entrySet()){
            System.out.println("Должность: " + entry.getKey());
            List<Employee> currentEmployers = entry.getValue();
            for (Employee employee : currentEmployers){
                System.out.println(employee);
            }
        }

        // вычислить среднюю зарплату

        Double averageSalary = staff.stream()
                .collect(Collectors.averagingInt(emp -> emp.getSalary()));

        System.out.println("Average salary: " + averageSalary);


        // получить список сотрудников с зп > 1000

        List<Employee> employeeWithSalaryMore1000 = staff.stream()
                .filter(emp -> emp.getSalary() > 1000)
                .toList();

        System.out.println(employeeWithSalaryMore1000);

        // найти всех сотрудников из отдела маркетинга и повысить им зп на 15%

        staff.stream()
                .filter(employee -> employee.getDepartment().equals("Marketing"))
                .forEach(employee -> employee.setSalary((int) (employee.getSalary() * 1.15)));


        // найти сотрудника с самой низкой зп

        Optional<Employee> minSalaryEmployee = staff.stream()
                .min(Comparator.comparingInt(value -> value.getSalary()));

        if (minSalaryEmployee.isPresent()) {
            System.out.println("Сотрудник с минимальной зп: " + minSalaryEmployee.get());
        } else {
            System.out.println("не найдено");
        }

        // найти сотрудников с самой высокой зп

        Optional<Employee> maxSalaryEmployee = staff.stream()
                .max(Comparator.comparingInt(value -> value.getSalary()));

        if (maxSalaryEmployee.isPresent()) {
            System.out.println("Сотрудник с максимальной зп: " + maxSalaryEmployee.get());
        } else {
            System.out.println("не найдено");
        }

        // этот алгоритм нам возвращает ТОЛЬКО одного а не всех с максимальной зарплатой

        Integer maxSalary = staff.stream()
                .mapToInt(emp -> emp.getSalary())
                .max()
                .orElse(0);

        List<Employee> employeesWithMaxSalary = staff.stream()
                .filter(emp -> emp.getSalary().equals(maxSalary))
                .toList();

        System.out.println("Список сотрудников с max зп: " + employeesWithMaxSalary);
    }
}
