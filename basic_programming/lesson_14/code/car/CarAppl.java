package car;

import car.model.Car;

public class CarAppl {
    public static void main(String[] args) {

        Car car = new Car("black", "Mercedes", false, 25000, "disel", 2.0, 10);
        car.displayCar();

        car.moveCare();

    }
}
