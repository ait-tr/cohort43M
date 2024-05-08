package code.polimorphism.transport;

public class MotoBmw extends Moto{
    public MotoBmw(String name) {
        super(name);
    }

    @Override
    void handChangeGear() {

    }

    @Override
    void speedUp() {

    }

    @Override
    public void movement() {
        System.out.println("Мотоцикл движется по своему");
    }
}
