package code.standartFunctionalInterfaces.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 25));
        employees.add(new Employee("Bill", 28));
        employees.add(new Employee("Robert", 29));
        employees.add(new Employee("Roman", 35));
        employees.add(new Employee("Alice", 18));
        employees.add(new Employee("David", 21));
        employees.add(new Employee("Charly", 45));

// создать новую коллекцию из сотрудников возрастом более 25 лет

        Integer ageForFilter = 25;

        Predicate<Employee> isOlderThan25 = employee -> employee.getAge() > ageForFilter;

        List<Employee> filteredStaff = filterEmployee(employees, isOlderThan25);

        System.out.println(filteredStaff);

    }

    private static List<Employee> filterEmployee(List<Employee> employees, Predicate<Employee> isOlderThan25) {
        List<Employee> filteredStaff = new ArrayList<>();
        for (Employee employee : employees){
            if (isOlderThan25.test(employee)) {
                filteredStaff.add(employee);
            }
        }

        return filteredStaff;
    }

    private static List<Employee> filterEmployeeAlternative(List<Employee> employees, Integer ageForFilter) {
        List<Employee> filteredStaff = new ArrayList<>();
        for (Employee employee : employees){
            if (employee.getAge() > ageForFilter) {
                filteredStaff.add(employee);
            }
        }

        return filteredStaff;
    }
}
