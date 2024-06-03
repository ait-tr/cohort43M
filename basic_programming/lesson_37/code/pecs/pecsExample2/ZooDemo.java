package code.pecs.pecsExample2;

public class ZooDemo {
    public static void main(String[] args) {
        ZooRepo repo = new ZooRepo();
        ZooUtil util = new ZooUtil();

        util.printZoo(repo.animalZoo);
        util.printZoo(repo.catZoo);


        util.addZooDog(repo.dogSmallZoo);
    }
}
