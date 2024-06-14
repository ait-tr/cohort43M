package code.example5.service;

import code.example5.entity.Cat;
import code.example5.repository.CatRepository;
import code.example5.repository.CatRepositoryInterface;
import code.library.var1.UserInput;

public class CatService {

    private CatRepositoryInterface repository ;
    private UserInput userInput ;

    public CatService(CatRepositoryInterface repository, UserInput userInput) {
        this.repository = repository;
        this.userInput = userInput;
    }

    public void addNewCat(){
        Cat cat = createNewCat();
        repository.addCat(cat);
    }

    private Cat createNewCat() {
        String catName = userInput.inputText("Введите имя вашего питомца :");
        Cat newCat = new Cat(catName);
        return newCat;
    }

}
