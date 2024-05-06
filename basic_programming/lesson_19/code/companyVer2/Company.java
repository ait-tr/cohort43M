package code.companyVer2;

public class Company {
    public static void main(String[] args) {
        Department firstDepartment = new Department("IT");


        Employee[] employees = firstDepartment.getEmployees();

        employees[0] = new Employee(1, "Roman");
        employees[1] = new Employee(2, "Petr");
        employees[2] = new Employee(3, "Sergej");

        printCompanyData(firstDepartment);



    }

    public static void printCompanyData(Department department){
        System.out.println("Отдел: " + department.getName());
        for (int i = 0; i < department.getEmployees().length; i++) {
            System.out.println("Сотрудник: ");

            Employee[] employees = department.getEmployees();
            Employee currentEmployee = employees[i];
            System.out.println("Имя: " + currentEmployee.getName());

            //System.out.println("Имя: " + department.getEmployees()[i].getName());

        }
    }
}
