package CompanyVar2;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Anton");
        employees[1] = new Employee("Alex");
        employees[2] = new Employee("Elena");
        employees[3] = new Employee("Max");
        employees[4] = new Employee("Peter");

        Department[] departments = new Department[3];
        departments[0] = new Department("IT", new Employee[3]);
        departments[1] = new Department("Management", new Employee[1]);
        departments[2] = new Department("Sales", new Employee[1]);

        departments[0].getEmployees()[0] = employees[0];
        departments[0].getEmployees()[1] = employees[1];
        departments[0].getEmployees()[2] = employees[2];

        departments[1].getEmployees()[0] = employees[4];

        departments[2].getEmployees()[0] = employees[3];

        for (int i = 0; i < departments.length; i++) {

            if (departments[i] != null) {
                System.out.println(departments[i].toString());

            }
        }
        System.out.println("Renamed IT department to Development and changed employee in Management department");
        departments[0].setName("Development");
        employees[4].setName("Leonid");

            for (Department department : departments) {
                System.out.println("Department: " + department.getName());
                for (Employee employee : department.getEmployees()) {
                    if (employee != null) {
                        System.out.println(" - " + employee.getName());
                    }
                }
            }


    }



}
