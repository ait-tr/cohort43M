public class Company {
    private String companyName;
    private Department[] departments;

    public Company(String companyName, Department[] departments) {
        this.companyName = companyName;
        this.departments = departments;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Department[] getDepartments() {
        return departments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Company{").append("Name='").append(companyName).append('\'').append(", Departments=[");
        for (int i = 0; i < departments.length; i++) {
            sb.append(departments[i]).append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append("]}");
        return sb.toString();
    }
}
