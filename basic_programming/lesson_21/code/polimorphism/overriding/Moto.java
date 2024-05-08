package code.polimorphism.overriding;

public class Moto extends Vehicles{

    // Overriding - переопределение методов (например родительского класса)

    @Override
    void drive() {
        System.out.println("Управление мотоциклом");
    }
}
