package code.companyVer5;

import java.util.Arrays;

public class Company {
    public static void main(String[] args) {
        CompanyUtil util = new CompanyUtil();

        Employee[] employeesForDep1= new Employee[3];
        Employee[] employeesForDep2= new Employee[5];

        Department[] departments = new Department[2];


        departments[0] = new Department("Marketing", employeesForDep1);
        departments[1] = new Department("IT", employeesForDep2);


        System.out.println(Arrays.toString(departments));

        // заполнить список сотрудников


        for (int i = 0; i < departments.length; i++) {
            util.fillDepartment(departments[i]);
            util.printCompanyData(departments[i]);
        }

        System.out.println(Arrays.toString(departments));


    }


}
