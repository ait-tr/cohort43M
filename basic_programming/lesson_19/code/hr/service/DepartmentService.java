package code.hr.service;

import code.hr.entity.Department;
import code.hr.repository.DepartmentRepository;

public class DepartmentService {

    private DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public void createDepartments() {
        departmentRepository.add(new Department("Marketing", 2));
        departmentRepository.add(new Department("IT", 3));
    }
}
