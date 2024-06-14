package code.example5.repository;

import code.example5.entity.Cat;

import java.util.ArrayList;
import java.util.List;

public class CatRepository implements CatRepositoryInterface{

    private List<Cat> cats;

    public CatRepository(List<Cat> cats) {
        this.cats = cats;
    }

    @Override
    public void addCat(Cat cat) {
        cats.add(cat);
    }

    @Override
    public List<Cat> findAll() {
        return cats;
    }

    @Override
    public void delete(Cat cat) {

    }

    @Override
    public List<Cat> findByName(String catName) {
        return List.of();
    }
}
