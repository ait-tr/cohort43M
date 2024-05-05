package homework_18;

public class Company {
    private String companyName;
    private int depNumber;
    private String depName;
    private Employee employee;

    public Company(String companyName, int depNumber, String depName, Employee employee) {
        this.companyName = companyName;
        this.depNumber = depNumber;
        this.depName = depName;
        this.employee = employee;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getDepNumber() {
        return depNumber;
    }

    public String getDepName() {
        return depName;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", depNumber=" + depNumber +
                ", depName='" + depName + '\'' +
                ", employee=" + employee +
                '}';
    }
}
