package code.polimorphism.transport;

public abstract class TransportVehicle implements Moving{

    private String name;

    public TransportVehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void speedUp();
}
