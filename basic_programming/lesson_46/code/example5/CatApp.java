package code.example5;


import code.example5.entity.Cat;
import code.example5.repository.CatRepository;
import code.example5.repository.CatRepositoryInterface;
import code.example5.service.CatService;
import code.example5.service.PrintCatService;
import code.example5.service.UserMenu;
import code.library.var1.UserInput;

import java.util.ArrayList;
import java.util.List;

public class CatApp {
    public static void main(String[] args) {

        List<Cat> catList = new ArrayList<>();
        CatRepositoryInterface repository = new CatRepository(catList);
        UserInput userInput = new UserInput();
        PrintCatService printCatService = new PrintCatService(repository);
        CatService catService = new CatService(repository,userInput);

        UserMenu menu = new UserMenu(catService,printCatService);

        menu.start();
        
    }
}
