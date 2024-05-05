package Company2.company;

public class Company {
    private String companyName;
    private Company2.company.Department[] departments;
    private int departmentCount;

    public Company(String companyName, int maxDepartments) {
        this.companyName = companyName;
        departments = new Company2.company.Department[maxDepartments];
        departmentCount = 0;
    }

    public void addDepartment(Company2.company.Department department) {
        if (departmentCount < departments.length) {
            departments[departmentCount] = department;
            departmentCount++;
        } else {
            System.out.println("Невозможно добавить отдел. Достигнуто максимальное количество отделов в компании.");
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public Company2.company.Department[] getDepartments() {
        return departments;
    }
}