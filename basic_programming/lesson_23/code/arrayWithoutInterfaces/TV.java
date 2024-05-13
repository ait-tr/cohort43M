package code.arrayWithoutInterfaces;

public class TV extends Device{

    private int size;
    private String technology;

    public TV(String name, String description, int size, String technology) {
        super(name, description);
        this.size = size;
        this.technology = technology;
    }

    @Override
    void switchOn() {
        System.out.println("Наш TV включен");
    }

    @Override
    void switchOff() {
        System.out.println("Наш TV выключен");
    }
}
