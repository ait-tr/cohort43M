package Company2.company;

public class CompanyAPP {
    public static void main(String[] args) {
        Company company = new Company("Купи продай", 3);

        Department department1 = new Department("Отдел продаж", 2);
        department1.addEmployee(new Employee("Иванов Иван"));
        department1.addEmployee(new Employee("Петров Петр"));
        company.addDepartment(department1);

        Department department2 = new Department("Отдел закупок", 2);
        department2.addEmployee(new Employee("Сидоров Сидор"));
        department2.addEmployee(new Employee("Алексеев Алексей"));
        company.addDepartment(department2);

        Department department3 = new Department("Бухгалтерия", 1);
        department3.addEmployee(new Employee("Николаев Николай"));
        company.addDepartment(department3);

        // Вывод информации о компании
        System.out.println("Компания - " + company.getCompanyName());
        for (int i = 0; i < company.getDepartments().length; i++) {
            Department department = company.getDepartments()[i];
            if (department != null) {
                System.out.print("Отдел " + (i + 1) + " - " + department.getDepartmentName() + " ");
                for (int j = 0; j < department.getEmployees().length; j++) {
                    Employee employee = department.getEmployees()[j];
                    if (employee != null) {
                        System.out.print("сотрудник №" + (j + 1) + " - " + employee.getName());
                        if (j < department.getEmployees().length - 1) {
                            System.out.print(", ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}