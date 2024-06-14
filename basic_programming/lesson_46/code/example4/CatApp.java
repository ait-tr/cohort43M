package code.example4;

public class CatApp {
    public static void main(String[] args) {
        CatService service = new CatService();

        service.addNewCat();

        service.getRepository().printDate();

        service.getRepository().addCat(new Cat("Barsik"));

        service.getRepository().printDate();

    }
}
