public class Main {
    public static void main(String[] args) {
        CompanyApp companyApp = new CompanyApp();
        Employee[] employees = companyApp.createAllEmployee();
        Company[] companies = companyApp.createAllCompany(employees);

        for (int i = 0; i < companies.length; i++) {
            System.out.println(companies[i]);
            
        }
    }
}
