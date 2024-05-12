package hwlesson21.Abstraction.task1;

public class Keyboard extends InputDevice {
    private String message;

    public Keyboard(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    void connect() {
        System.out.println("Keyboard connected");
    }

    @Override
    void disconnect() {
        System.out.println("Keyboard disconnected");
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "message='" + message + '\'' +
                '}';
    }
}
