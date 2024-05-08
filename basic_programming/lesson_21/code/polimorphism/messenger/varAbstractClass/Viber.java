package code.polimorphism.messenger.varAbstractClass;

public class Viber extends Messenger{
    @Override
    void getMessage() {
        System.out.println("Принимаем сообщение в Viber");
    }

    @Override
    void sendMessage() {
        System.out.println("Отправляем сообщение в Viber");
    }
}
