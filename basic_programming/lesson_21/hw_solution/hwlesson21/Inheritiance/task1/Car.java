package hwlesson21.Inheritiance.task1;

public class Car extends Vehicle{
    int amountOfDoors;

    public Car(String brand, String model, int year,int amountOfDoors) {
        super(brand, model, year);
        this.amountOfDoors = amountOfDoors;
    }

    public int getAmountOfDoors() {
        return amountOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "amountOfDoors=" + amountOfDoors +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                "} ";
    }

    @Override
    public void isMoving() {
        System.out.println("Car is moving! Beep Beep");;
    }
    public void startEngine() {
        System.out.println("You're ready to go! Engine has been started.");;
    }
}
