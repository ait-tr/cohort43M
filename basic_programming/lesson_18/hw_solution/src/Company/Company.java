package Company;

public class Company {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Anton", "IT");
        employees[1] = new Employee("Alex", "Service");
        employees[2] = new Employee("Elena", "Accounting");

        for (int i = 0; i < employees.length; i++) {

            if (employees[i] != null) {
                System.out.println(employees[i].toString());

            }
        }
        employees[2].setDepartment("Management");
        System.out.println("-------updated list of employees-----------------");
        for (int i = 0; i < employees.length; i++) {

            if (employees[i] != null) {

                System.out.println("Company NN");
                System.out.println("Name of employee: " + employees[i].getName());
                System.out.println("Department of employee: " + employees[i].getDepartment());
            }
        }
    }
}
