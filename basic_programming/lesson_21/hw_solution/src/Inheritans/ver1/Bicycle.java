package Inheritans.ver1;

public class Bicycle extends Vehicle{
    private String type;

    public Bicycle(String model, String color, String type) {
        super(model, color);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "Bicycle{" +
                "type='" + type + '\'' +
                '}';
    }
}
