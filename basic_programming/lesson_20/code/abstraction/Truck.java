package code.abstraction;

public class Truck extends Car{
    public Truck(String model) {
        super(model);
    }

    @Override
    void beep() {
        System.out.println("TRUCK!!!");
    }

    @Override
    int speedUp() {

        System.out.println(
                "ГРУЗОВИК!!!"
        );
        return 100;

    }
}
