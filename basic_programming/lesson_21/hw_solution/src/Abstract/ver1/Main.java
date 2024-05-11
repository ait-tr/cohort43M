package Abstract.ver1;

public class Main {
    public static void main(String[] args) {
        KeyBoard keyBoard = new KeyBoard();
        Mouse mouse = new Mouse();
        mouse.connect();
        keyBoard.connect();
    }
}
