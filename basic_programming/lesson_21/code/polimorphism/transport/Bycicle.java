package code.polimorphism.transport;

public class Bycicle extends TransportVehicle{
    public Bycicle(String name) {
        super(name);
    }

    @Override
    void speedUp() {

    }

    @Override
    public void movement() {
        System.out.println("Велосипед едет медленно");
    }
}
