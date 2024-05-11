package Abstract.ver1;

public class KeyBoard extends InputDevice{
    @Override
    public void connect() {
        System.out.println("KeyBoard is connect");

    }

    @Override
    public void disconnect() {
        System.out.println("KeyBoard is disconnect");

    }
}
