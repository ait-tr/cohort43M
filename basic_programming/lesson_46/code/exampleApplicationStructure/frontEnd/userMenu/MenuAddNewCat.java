package code.exampleApplicationStructure.frontEnd.userMenu;

import code.exampleApplicationStructure.backEnd.dto.CatFromUser;
import code.library.var1.UserInput;

public class MenuAddNewCat {

    UserInput userInput = new UserInput();

    public CatFromUser menuAddNewCat(){
        String catName = userInput.inputText("Введите имя вашего питомца: ");
        CatFromUser catFromUser = new CatFromUser(catName);
        return catFromUser;
    }

}
