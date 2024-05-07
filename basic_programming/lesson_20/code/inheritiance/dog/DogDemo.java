package code.inheritiance.dog;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Zeus", "Cane corso");
        dog.voice("Наша собака громко лает на дверь");

        SmallDog smallDog = new SmallDog("Gera", "Shiatsu");
        smallDog.voiceSmallDog();
        smallDog.visitGroomer();


        Dog[] dogs = new Dog[3];
        SmallDog[] smallDogs = new SmallDog[2];

        for (int i = 0; i < dogs.length; i++) {

        }

        for (int i = 0; i < smallDogs.length; i++) {

        }

    }
}
