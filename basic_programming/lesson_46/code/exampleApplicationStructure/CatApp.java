package code.exampleApplicationStructure;


import code.exampleApplicationStructure.backEnd.entity.Cat;
import code.exampleApplicationStructure.backEnd.repository.CatRepository;
import code.exampleApplicationStructure.backEnd.repository.CatRepositoryInterface;
import code.exampleApplicationStructure.backEnd.service.CatService;
import code.exampleApplicationStructure.backEnd.service.PrintCatService;
import code.exampleApplicationStructure.frontEnd.userMenu.UserMenu;
import code.library.var1.UserInput;

import java.util.ArrayList;
import java.util.List;

public class CatApp {
    public static void main(String[] args) {

        List<Cat> catList = new ArrayList<>();
        CatRepositoryInterface repository = new CatRepository(catList);
        UserInput userInput = new UserInput();
        PrintCatService printCatService = new PrintCatService(repository);
        CatService catService = new CatService(repository);

        UserMenu menu = new UserMenu(catService,printCatService,userInput);

        menu.start();
        
    }
}
