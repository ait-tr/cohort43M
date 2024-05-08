package code.polimorphism.interface2;


public class Demo {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Duck duck = new Duck();
        Eagle eagle = new Eagle();
        Person person = new Person();

        SwimInterface[] swimmings = {person, fish, duck};

        Flying[] flyings = {eagle, duck};

        swimmings[2].swim();

        flyings[1].fly();


    }
}
