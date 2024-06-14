package code.example5.service;

public class UserMenu {

    CatService service;
    PrintCatService printCatService;

    public UserMenu(CatService service, PrintCatService printCatService) {
        this.service = service;
        this.printCatService = printCatService;
    }

    public void start(){
        while (true){
            /*
            меню:
            1) добавить нового кота
            2) вывод информации о всех котах
            3) поиск кота по имени
            4) удаление кота из списка
            5) обновление данных о котах
            6) выход
             */
            service.addNewCat();
            printCatService.printData();
        }
    }
}
