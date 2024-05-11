package Abstract.ver1;

public class Mouse extends InputDevice{
    @Override
    public void connect() {
        System.out.println("Mouse is connect");
    }

    @Override
    public void disconnect() {
        System.out.println("Mouse is disconnect");

    }
}
