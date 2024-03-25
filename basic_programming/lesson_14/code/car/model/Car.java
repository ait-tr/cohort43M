package car.model;

public class Car {
    //fields
    private String color;
    private String brand;
    private boolean isManual;
    private int price;
    private String typeOfEngine;
    private double engineVolume;
    private int age;

    // object -> constructor
    public Car(String color, String brand, boolean isManual, int price, String typeOfEngine, double engineVolume, int age) {
        this.color = color;
        this.brand = brand;
        this.isManual = isManual;
        this.price = price;
        this.typeOfEngine = typeOfEngine;
        this.engineVolume = engineVolume;
        this.age = age;
    }

    // setters (set) and getters (get)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayCar(){
        System.out.println("Brand: " + brand + ", color: " + color + ", is manual: " + isManual + ", age: " + age);
    }

    public void moveCare(){
        System.out.println("Carr is moving... Beep!");
    }

}
