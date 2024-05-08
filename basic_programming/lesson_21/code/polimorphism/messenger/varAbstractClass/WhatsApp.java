package code.polimorphism.messenger.varAbstractClass;

public class WhatsApp extends Messenger{
    @Override
    void getMessage() {
        System.out.println("Принимаем сообщение в WhatsApp");
    }

    @Override
    void sendMessage() {
        System.out.println("Отправляем сообщение в WhatsApp");
    }
}
