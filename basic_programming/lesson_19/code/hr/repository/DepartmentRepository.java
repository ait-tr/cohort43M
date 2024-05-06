package code.hr.repository;

import code.hr.entity.Department;

import java.util.Arrays;

public class DepartmentRepository {
    private Department[] departments;

    public DepartmentRepository(Department[] departments) {
        this.departments = departments;
    }

    public void add(Department department) {
        for (int i = 0; i < departments.length; i++) {
            if (departments[i] == null) {
                departments[i] = department;
                return;
            }
        }
        System.out.println("База данных переполненна!");
    }

    public Department findByName(String name){
        for (int i = 0; i < departments.length; i++) {
            if (departments[i].getDepartmentName().equals(name)) {
                return departments[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "DepartmentRepository{" +
                "departments=" + Arrays.toString(departments) +
                '}';
    }
}
