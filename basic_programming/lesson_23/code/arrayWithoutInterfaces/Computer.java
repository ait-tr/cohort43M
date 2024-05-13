package code.arrayWithoutInterfaces;

public class Computer extends Device{

    private int size;
    private String processor;

    public Computer(String name, String description, int size, String processor) {
        super(name, description);
        this.size = size;
        this.processor = processor;
    }

    @Override
    void switchOn() {
        System.out.println("Наш компьютер включен");
    }

    @Override
    void switchOff() {
        System.out.println("Наш компьютер выключен");
    }
}
