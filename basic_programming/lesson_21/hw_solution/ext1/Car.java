package homework.ext.ext1;

public class Car extends Vehicle{

    private int numberOfDoors;

    public Car(int year, String brand, int numberOfWheels, int numberOfDoors) {
        super(year, brand, numberOfWheels);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public void service() {
        System.out.println("Driving...");
    }
}
