package hwlesson21.Inheritiance.task1;

public class Bicycle extends Vehicle{
    String typeOfBicycle;

    public Bicycle(String brand, String model, int year, String typeOfBicycle) {
        super(brand, model, year);
        this.typeOfBicycle = typeOfBicycle;
    }

    public String getTypeOfBicycle() {
        return typeOfBicycle;
    }

    public void setTypeOfBicycle(String typeOfBicycle) {
        this.typeOfBicycle = typeOfBicycle;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "typeOfBicycle='" + typeOfBicycle + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                "} ";
    }

    @Override
    public void isMoving() {
        System.out.println("I'm driving a bicycle");
    }
}
