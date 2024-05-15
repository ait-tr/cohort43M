package code.arrayLIstObjects2;

public class CatDemo {
    public static void main(String[] args) {


        CatRepository repository = new CatRepository();

        for (int i = 0; i < 5; i++) {
            Cat cat = new Cat("Cat # " + i, "breed # " + i / 2);
            repository.addCat(cat);
        }

        repository.printData();

        Cat runawayCat = new Cat("Cat # 3", "breed # 3");
        repository.runawayCat(runawayCat);

        repository.printData();

        System.out.println(repository.findByBreed("breed # 1"));


    }
}
