public class Car {
    int numberOfWheels;
    double wheelDiameter;
    Engine engine;
    String brand;
    String model;

    public Car(int numberOfWheels, double wheelDiameter, Engine engine, String brand, String model) {
        this.numberOfWheels = numberOfWheels;
        this.wheelDiameter = wheelDiameter;
        this.engine = engine;
        this.brand = brand;
        this.model = model;
    }

    public void startEngine() {
        System.out.println(brand + " " + model + ": ");
        engine.start();
    }

    public void stopEngine() {
        System.out.println(brand + " " + model + ": ");
        engine.stop();
    }

    public void signal() {
        System.out.println(brand + " " + model + ": Beep beep!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfWheels=" + numberOfWheels +
                ", wheelDiameter=" + wheelDiameter +
                ", engine=" + engine +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
