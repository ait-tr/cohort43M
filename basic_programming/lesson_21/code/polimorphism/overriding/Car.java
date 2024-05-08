package code.polimorphism.overriding;

public class Car extends Vehicles{

    // Overriding - переопределение методов (например родительского класса)

    @Override
    void drive() {
        System.out.println("Управление автомобилем");
    }
}
