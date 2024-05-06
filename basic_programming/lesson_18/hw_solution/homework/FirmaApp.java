package homework;

public class FirmaApp {

    public static void main(String[] args) {
        FirmaService service = new FirmaService();
        Firma[] ourWorkers = service.createDepartmentFirma();

        for (int i = 0; i < ourWorkers.length; i++){
            System.out.println("Итоговая информация: " + ourWorkers[i]);
        }
    }
}
