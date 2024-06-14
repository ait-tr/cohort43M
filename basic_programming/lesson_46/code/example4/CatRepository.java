package code.example4;

import java.util.ArrayList;
import java.util.List;

public class CatRepository {

    private List<Cat> cats;

    public CatRepository() {
        this.cats = new ArrayList<>();
    }

    public void addCat(Cat cat){
        cats.add(cat);
    }

    public void printDate() {
        System.out.println("Список котов и кошек:");
        for (Cat cat : cats){
            System.out.println("Кличка кота / кошки :" + cat.getName());
        }
    }
}
