package homework.ext.ext1;

public class Bicycle extends Vehicle {

    private boolean engine;

    public Bicycle(int year, String brand, int numberOfWheels, boolean engine) {
        super(year, brand, numberOfWheels);
        this.engine = engine;
    }

    public boolean isEngine() {
        return engine;
    }

    @Override
    public void service() {
        System.out.println("Riding...");
    }
}
