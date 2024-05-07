package code.abstraction;

public class SportCar extends Car{
    public SportCar(String model) {
        super(model);
    }

    @Override
    void beep() {
        System.out.println("МЕТОД КОТОРЫЙ Я ПОЛУЧИЛ ОТ РОДИТЕЛЯ И ЧУТЬ НЕ ЗАБЫЛ ПЕРЕОПРЕДЕЛИТЬ");
    }

    @Override
    int speedUp() {
        System.out.println("наш спорткар ускоряется до 320");
        return 320;
    }
}
