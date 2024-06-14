package code.example5.repository;

import code.example5.entity.Cat;

import java.util.List;

public interface CatRepositoryInterface {

    void addCat(Cat cat);

    List<Cat> findAll();

    void delete(Cat cat);

    List<Cat> findByName(String catName);

}
