package code.arrayLIstObjects2;

import java.util.ArrayList;

public class CatRepository {

    ArrayList<Cat> cats = new ArrayList<>();

    public void addCat(Cat newCat){
        cats.add(newCat);
    }

    public void runawayCat(Cat cat){
        cats.remove(cat);
    }

    public void printData(){
        System.out.println("---------------------");
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }
}
