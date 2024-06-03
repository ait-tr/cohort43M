package code.pecs.pecsExample3;

public class ZooDemo {
    public static void main(String[] args) {
        ZooRepo repo = new ZooRepo();
        ZooUtil util = new ZooUtil();

        util.addZooDog(repo.dogZoo);
        util.addZooDog(repo.animalZoo);
        util.addZooDog(repo.dogSmallZoo);

    }
}
