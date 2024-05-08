package code.polimorphism.messenger.varInterface;

public class WhatsApp implements Messenger, VideoChat {
    @Override
    public void getMessage() {
        System.out.println("Принимаем сообщение в WhatsApp");
    }

    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в WhatsApp");
    }

    @Override
    public void startVideoChat() {

    }

    @Override
    public void endVideoChat() {

    }
}
