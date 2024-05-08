package code.polimorphism.messenger.varInterface;

public class Telegram implements Messenger, VideoChat {
    @Override
    public void getMessage() {
        System.out.println("Принимаем сообщение в Telegram");
    }

    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в Telegram");
    }

    @Override
    public void startVideoChat() {

    }

    @Override
    public void endVideoChat() {

    }
}
