package code.exampleApplicationStructure.backEnd.repository;

import code.exampleApplicationStructure.backEnd.entity.Cat;

import java.util.List;

public interface CatRepositoryInterface {

    Cat addCat(Cat cat);

    List<Cat> findAll();

    void delete(Cat cat);

    List<Cat> findByName(String catName);

}
