package hwlesson21.Abstraction.task1;

public class Mouse extends InputDevice {


    @Override
    void connect() {
        System.out.println("Mouse connected");
    }

    @Override
    void disconnect() {
        System.out.println("Mouse disconnected");
    }
}
