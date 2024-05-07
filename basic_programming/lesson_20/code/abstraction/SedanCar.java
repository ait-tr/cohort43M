package code.abstraction;

public class SedanCar extends Car{
    public SedanCar(String model) {
        super(model);
    }

    @Override
    void beep() {
        System.out.println("BEEP!!!! BEEP!!!");
    }

    @Override
    int speedUp() {
        System.out.println("наш седан ускоряется до 120");
        return 120;
    }
}
