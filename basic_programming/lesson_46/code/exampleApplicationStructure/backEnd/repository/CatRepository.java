package code.exampleApplicationStructure.backEnd.repository;

import code.exampleApplicationStructure.backEnd.entity.Cat;

import java.util.List;

public class CatRepository implements CatRepositoryInterface {

    private List<Cat> cats;

    private int counter = 0;

    public CatRepository(List<Cat> cats) {
        this.cats = cats;
    }

    @Override
    public Cat addCat(Cat cat) {

        counter++;
        Cat newCat = new Cat(counter, cat.getName());
        cats.add(newCat);
        return newCat;
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
