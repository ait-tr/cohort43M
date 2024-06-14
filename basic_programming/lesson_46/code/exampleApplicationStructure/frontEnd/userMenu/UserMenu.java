package code.exampleApplicationStructure.frontEnd.userMenu;

import code.exampleApplicationStructure.backEnd.dto.CatFromUser;
import code.exampleApplicationStructure.backEnd.service.CatService;
import code.exampleApplicationStructure.backEnd.service.PrintCatService;
import code.library.var1.UserInput;

public class UserMenu {

    CatService service;
    PrintCatService printCatService;
    UserInput userInput = new UserInput();

    public UserMenu(CatService service, PrintCatService printCatService, UserInput userInput) {
        this.service = service;
        this.printCatService = printCatService;
        this.userInput = userInput;
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

            String catName = userInput.inputText("Введите имя вашего питомца: ");
            CatFromUser catFromUser = new CatFromUser(catName);
            service.addNewCat(catFromUser);
            printCatService.printData();
        }
    }
}
