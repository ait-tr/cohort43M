package code.hr.repository;

import code.hr.entity.Department;

public class DepartmentRepository {
    private Department[] departments;

    public void add(Department department) {
        for (int i = 0; i < departments.length; i++) {
            if (departments[i] == null) {
                departments[i] = department;
                break;
            }
            System.out.println("База данных переполненна!");
        }
    }

    public Department findByName(String name){
        for (int i = 0; i < departments.length; i++) {
            if (departments[i].getDepartmentName().equals(name)) {
                return departments[i];
            }
        }
        return null;
    }

}
