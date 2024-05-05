package homework_18;

public class CompanyApp {
    public static void main(String[] args) {
        CompanyService service = new CompanyService();

        Company[] ourList = service.createList();
        for (int i = 0; i < ourList.length; i++){
            System.out.println(ourList[i]);
        }
    }


}
