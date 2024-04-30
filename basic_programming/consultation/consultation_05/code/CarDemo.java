public class CarDemo {
    public static void main(String[] args) {

        // создать двигатели

        Engine e1 = new Engine(1800, "petrol");
        Engine e2 = new Engine(2000, "disel");
        Engine e3 = new Engine(0, "electric");

        Car[] cars = new Car[3];

        cars[0] = new Car(4, 17,e1,"Toyota", "Corolla");
        cars[1] = new Car(4, 19,e1,"BMW", "520");
        cars[2] = new Car(4, 21,e1,"Mercedes", "B200");

        for (int i = 0; i < 3; i++) {
            System.out.println(cars[i]);
        }

    }
}
