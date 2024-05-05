public class Main {
    public static void main(String[] args) {
        DeportamenService service = new DeportamenService();
        Company company = service.createCompany();
        System.out.println(company);
    }
}