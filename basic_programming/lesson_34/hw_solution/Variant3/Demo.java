package Variant3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Company company = new Company();
        Department Development = new Department("Development");
        Department Management = new Department("Management");


        company.addDepartment(Management);
        company.addDepartment(Development);



        Employee sammuel = new Employee("Sammuel","John","java developer", "Development");
        Employee amanda = new Employee("Amanda","Smith","python developer", "Development");


        Employee alex = new Employee("Alex","House","Project Manager", "Management");
        Employee arsen = new Employee("Arsen","Adams","CEO", "Management");

        Development.addNewEmployee(sammuel);
        Development.addNewEmployee(amanda);

        Management.addNewEmployee(alex);
        Management.addNewEmployee(arsen);
        company.printCompanyReport();

        System.out.println("After transfer: ");
        company.transferEmployee(amanda, "Development", "Management");

        company.printCompanyReport();



    }
}