package code.hr.service;

import code.hr.entity.Applicant;
import code.hr.entity.Department;
import code.hr.entity.Employee;
import code.hr.repository.EmployeeRepository;
import code.library.var1.UserInput;

public class EmployeeService {
    private EmployeeRepository employeeRepository;
    private ApplicantService applicantService;

    public EmployeeService(EmployeeRepository employeeRepository, ApplicantService applicantService) {
        this.employeeRepository = employeeRepository;
        this.applicantService = applicantService;
    }

    public void addNewEmployee(int applicantId, Department department) {

        Applicant applicant = applicantService.findById(applicantId);

        UserInput ui = new UserInput();

        int newEmployeeId = ui.inputInt("Введите номер нового сотрудника: ");
        String newEmployeePosition = ui.inputText("Введите должность: ");
        int newEmployeeSalary = ui.inputInt("Введите его зарплату: ");

        Employee  employee = new Employee(
                newEmployeeId,
                applicant.getPerson(),
                department,
                newEmployeePosition,
                newEmployeeSalary
        );

        employeeRepository.add(employee);
    }

}
