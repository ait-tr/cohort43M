package code.polimorphism.transport;

public abstract class Moto extends TransportVehicle{
    public Moto(String name) {
        super(name);
    }

    abstract void handChangeGear();
}
