package code.polimorphism.messenger.varAbstractClass;

public class Telegram extends Messenger{
    @Override
    void getMessage() {
        System.out.println("Принимаем сообщение в Telegram");
    }

    @Override
    void sendMessage() {
        System.out.println("Отправляем сообщение в Telegram");
    }
}
