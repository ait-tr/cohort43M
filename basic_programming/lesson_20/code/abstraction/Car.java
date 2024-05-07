package code.abstraction;

public abstract class Car {

    private String model;

    public Car(String model) {
        this.model = model;
    }


    public void printModel() {
        System.out.println("Model name: " + model);
    }

    abstract void beep();

    abstract int speedUp();

}
