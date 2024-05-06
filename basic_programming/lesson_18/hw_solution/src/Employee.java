public class Employee {

    private String empName;
    private String EmpSurname;
    private int empAge;

    public Employee(String empName, String empSurname, int empAge) {
        this.empName = empName;
        EmpSurname = empSurname;
        this.empAge = empAge;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpSurname() {
        return EmpSurname;
    }

    public int getEmpAge() {
        return empAge;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", EmpSurname='" + EmpSurname + '\'' +
                ", empAge=" + empAge +
                '}';
    }
}
