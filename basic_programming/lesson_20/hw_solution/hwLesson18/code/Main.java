public class Main {
    public static void main(String[] args) {
        DepartmentService service = new DepartmentService();
        Company company = service.createCompany();
        System.out.println(company);
    }
}
