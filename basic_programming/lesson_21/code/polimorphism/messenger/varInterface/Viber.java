package code.polimorphism.messenger.varInterface;

public class Viber implements Messenger {
    @Override
    public void getMessage() {
        System.out.println("Принимаем сообщение в Viber");
    }

    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в Viber");
    }
}
