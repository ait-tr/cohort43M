package code.pecs.pecsExample2;

public class ZooUtil {

     void printZoo(Zoo<? extends Animal> zoo){
        Animal item = zoo.getItem();
        System.out.println(item);
    }

    void addZooDog(Zoo<DogSmall> zoo) {
         zoo.setItem(new DogSmall());
    }

}
