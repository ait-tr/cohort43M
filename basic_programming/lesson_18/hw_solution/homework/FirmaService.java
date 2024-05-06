package homework;

public class FirmaService {

    UserInput ui = new UserInput();

    public Firma createFirma(){
        int id = ui.inputInt("Введите номер ID сотрудника: ");
        String name = ui.inputText("Ведите ФИО сотрудника: ");
        String companyName = ui.inputText("Введите название фирмы: ");
        String departmentName = ui.inputText("Введите название отдела: ");



        Firma newFirma = new Firma(id,name,companyName,departmentName);

        return newFirma;

    }

    public Firma[] createDepartmentFirma(){
        int totalWorker = ui.inputInt("Введите общее количество сотрудников в отделе: ");

        Firma[] workers = new Firma[totalWorker];

        for (int i = 0; i < totalWorker; i++){
            workers[i] = createFirma();
        }
        return workers;
    }
}
