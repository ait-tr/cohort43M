package Inheritans.ver1;

public class Car extends Vehicle{
    private boolean isBenzin;

    public Car(String model, String color, boolean isBenzin) {
        super(model, color);
        this.isBenzin = isBenzin;
    }

    public boolean isBenzin() {
        return isBenzin;
    }

    public void setBenzin(boolean benzin) {
        isBenzin = benzin;
    }

    @Override
    public String toString() {
        return super.toString() + "Car{" +
                "isBenzin=" + isBenzin +
                '}';
    }

}
