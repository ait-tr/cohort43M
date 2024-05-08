package code.polimorphism.overriding;

public class OverridingDemo {
    public static void main(String[] args) {
        Car car = new Car();
        Moto moto = new Moto();

        Vehicles[] vehicles = {car, moto};

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].drive();
        }
    }
}
