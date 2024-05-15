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


    public Cat findByName(String name){
        for (int i = 0; i < cats.size(); i++) {
            if (cats.get(i).getName().equals(name)) {
                return cats.get(i);
            }
        }
        return null;
    }

    public ArrayList<Cat> findByBreed(String breed){
       ArrayList<Cat> catsWithSameBreed = new ArrayList<>();

        for (int i = 0; i < cats.size(); i++) {
            if (cats.get(i).getBreed().equals(breed)) {
                catsWithSameBreed.add(cats.get(i));
            }
        }

        return catsWithSameBreed;
    }

    public void printData(){
        System.out.println("---------------------");
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }
}
