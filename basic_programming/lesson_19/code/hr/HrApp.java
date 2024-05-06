package code.hr;

import code.hr.entity.Applicant;
import code.hr.entity.Department;
import code.hr.entity.Employee;
import code.hr.repository.ApplicantRepository;
import code.hr.repository.DepartmentRepository;
import code.hr.repository.EmployeeRepository;
import code.hr.service.ApplicantService;
import code.hr.service.DepartmentService;
import code.hr.service.EmployeeService;

public class HrApp {
    public static void main(String[] args) {

        Applicant[] applicants = new Applicant[10];
        Employee[] employees = new Employee[5];
        Department[] departments = new Department[2];

        ApplicantRepository applicantRepository = new ApplicantRepository(applicants);
        EmployeeRepository employeeRepository = new EmployeeRepository(employees);
        DepartmentRepository departmentRepository = new DepartmentRepository(departments);

        ApplicantService applicantService = new ApplicantService(applicantRepository);
        EmployeeService employeeService = new EmployeeService(employeeRepository, applicantService);
        DepartmentService departmentService = new DepartmentService(departmentRepository);

        departmentService.createDepartments();

        System.out.println(departmentRepository);

        applicantService.addNewApplicant();
        applicantService.addNewApplicant();
        applicantService.addNewApplicant();

        System.out.println(applicantRepository);

        System.out.println(employeeRepository);
        employeeService.addNewEmployee(1,departmentRepository.findByName("IT"));
        System.out.println(employeeRepository);


    }
}
