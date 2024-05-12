package hwlesson21.Abstraction.task1;

public class Demo {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("Hello");
        keyboard.connect();
        System.out.println(keyboard.getMessage());
        Mouse mouse = new Mouse();
        System.out.println();
        mouse.disconnect();
    }
}
