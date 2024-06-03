package code.pecs.pecsExample3;

public class ZooUtil {


    void addZooDog(Zoo<? super DogSmall> zoo) {
         zoo.setItem(new DogSmall());
    }

}
