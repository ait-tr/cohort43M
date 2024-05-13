package code.arrayWithoutInterfaces;

public abstract class Device {

    private String name;
    private String description;

    public Device(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    abstract void switchOn();
    abstract void switchOff();

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
