public class Company {
    private String company;
    private int department;
    private Employee employee;

    public Company(String company, int department, Employee employee) {
        this.company = company;
        this.department = department;
        this.employee = employee;
    }

    public String getCompany() {
        return company;
    }

    public int getDepartment() {
        return department;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return "Company{" +
                "company='" + company + '\'' +
                ", department=" + department +
                ", employee=" + employee +
                '}';
    }
}
