package hwlesson21.Abstraction.task2;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Guitar");
        Guitar guitar = new Guitar();
        guitar.playNote();

        System.out.println("Piano");
        Piano piano = new Piano();
        piano.playNote();

        System.out.println("Violin");
        Violin violin = new Violin();
        violin.playNote();
    }
}
