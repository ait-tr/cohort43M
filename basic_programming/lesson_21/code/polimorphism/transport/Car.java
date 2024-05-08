package code.polimorphism.transport;

public abstract class Car extends TransportVehicle {
    public Car(String name) {
        super(name);
    }

    abstract void changeGear();
}
