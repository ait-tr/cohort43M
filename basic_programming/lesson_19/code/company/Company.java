package code.company;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee(1, "Ruslan", "Marketing");
        employees[1] = new Employee(2, "Oleg", "Marketing");
        employees[2] = new Employee(3, "Roman", "IT");
        employees[3] = new Employee(4, "Olga", "Accounting");
        employees[4] = new Employee(5, "Vlad", "Management");


        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("Сотрудник: ");
                System.out.println("Имя: " + employees[i].getName());
                System.out.println("Отдел: " + employees[i].getDepartment());
            }
        }

        employees[1].setDepartment("Management");

        System.out.println("---------- список сотрудников после перевода сотрудника в другой отдел -----");

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("Сотрудник: ");
                System.out.println("Имя: " + employees[i].getName());
                System.out.println("Отдел: " + employees[i].getDepartment());
            }
        }


        System.out.println("---------- список сотрудников после найма нового сотрудника  -----");

        employees[2] = new Employee(6, "Sergey", "IT");

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("Сотрудник: ");
                System.out.println("Имя: " + employees[i].getName());
                System.out.println("Отдел: " + employees[i].getDepartment());
            }
        }

    }
}
