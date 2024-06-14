package code.exampleApplicationStructure.backEnd.service;

import code.exampleApplicationStructure.backEnd.dto.CatFromUser;
import code.exampleApplicationStructure.backEnd.entity.Cat;
import code.exampleApplicationStructure.backEnd.repository.CatRepositoryInterface;

public class CatService {

    private CatRepositoryInterface repository ;

    public CatService(CatRepositoryInterface repository) {
        this.repository = repository;
    }

    public void addNewCat(CatFromUser catFromUser){
        Cat cat = createNewCat(catFromUser.getCatName());
        repository.addCat(cat);
    }

    private Cat createNewCat(String catName) {
        // провести проверку (валидацию) корректности данных (например имени кота)
         Cat newCat = new Cat(catName);
        return newCat;
    }

}
