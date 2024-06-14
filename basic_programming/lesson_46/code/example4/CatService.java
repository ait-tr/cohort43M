package code.example4;

import code.library.var1.UserInput;

public class CatService {

    private CatRepository repository = new CatRepository();
    private UserInput userInput = new UserInput();

    public void addNewCat(){
        Cat cat = createNewCat();
        repository.addCat(cat);
    }

    private Cat createNewCat() {
        String catName = userInput.inputText("Введите имя вашего питомца :");
        Cat newCat = new Cat(catName);
        return newCat;
    }

    public CatRepository getRepository() {
        return repository;
    }
}
