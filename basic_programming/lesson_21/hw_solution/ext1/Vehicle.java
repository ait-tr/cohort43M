package homework.ext.ext1;

public class Vehicle {
    private int year;
    private String brand;

    private int numberOfWheels;

    public Vehicle(int year, String brand, int numberOfWheels) {
        this.year = year;
        this.brand = brand;
        this.numberOfWheels = numberOfWheels;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void service(){
        System.out.println("Beep...");
    }
}


