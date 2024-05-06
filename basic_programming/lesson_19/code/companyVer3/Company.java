package code.companyVer3;

public class Company {
    public static void main(String[] args) {

        // ======= вариант 1 - передача через конструктор количества элементов в массиве ========
        // создание массива происходит внутри класса Department

        Department firstDepartment = new Department("IT", 3);



        // ======= вариант 2 - передача через конструктор ССЫЛКИ на массив ========
        Employee[] employees = new Employee[5];

        // мы вызовем метод, который ЗАПОЛНИТ данными этот массив

        Department2 secondDepartment = new Department2("Marketing",employees);






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
