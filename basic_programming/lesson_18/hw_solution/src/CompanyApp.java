public class CompanyApp {
    UserInput ui = new UserInput();

public Company createCompany(Employee[] employees) {

    int numbers = ui.inputInt("Введите номер сотрудника ");
    Employee employee = employees[numbers];
    String company = ui.inputText("Ведите назваине компании");
    int department = ui.inputInt("Ведите номер департамента");
    Company company1 = new Company(company, department, employee);
    return company1;
  }
  public Company[] createAllCompany(Employee[] employees){
    int number = ui.inputInt("Введите номер компании");
    Company[] companies = new Company[number];

      for (int i = 0; i <companies.length; i++) {
          companies[i] = createCompany(employees);
      }
      return companies;
  }
  public Employee createEmployee() {
    String empName = ui.inputText("Ведите имя сотрудника");
    String empSurname = ui.inputText("Ведите фамилию сотрудника");
    int empAge = ui.inputInt("Возраст сотрудника");
      Employee employee = new Employee(empName, empSurname, empAge);

      return employee;
  }
  public Employee[] createAllEmployee(){
    int numbersEmployee = ui.inputInt("Ведите количество сотрудников");

    Employee[] employees = new Employee[numbersEmployee];

      for (int i = 0; i < employees.length; i++) {
          employees[i] = createEmployee();
      }
      return employees;
}

}

