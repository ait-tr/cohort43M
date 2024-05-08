package code.polimorphism.transport;

public class NormalCar extends Car{
    public NormalCar(String name) {
        super(name);
    }

    @Override
    void changeGear() {
        System.out.println("Коробка автомат");
    }

    @Override
    void speedUp() {
        System.out.println("ускорение на 5 км/час");
    }

    @Override
    public void movement() {
        System.out.println("Автомобиль движется вперед");
    }
}
