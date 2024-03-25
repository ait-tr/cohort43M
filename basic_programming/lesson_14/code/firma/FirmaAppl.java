package firma;

import firma.model.Employee;

public class FirmaAppl {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Leonid", "Kleimann", 60, true, 7000);
        Employee e2 = new Employee(2, "Alex", "LastName1", 35, true, 6500);
        Employee e3 = new Employee(3, "Maria", "LastName2", 45, false, 7800);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        double totalSalary = e1.getSalary() + e2.getSalary() + e3.getSalary();
        System.out.println("Total salary: " + totalSalary);

        e1.lunch();
        e2.sleep();
        e3.work();

    }
}
