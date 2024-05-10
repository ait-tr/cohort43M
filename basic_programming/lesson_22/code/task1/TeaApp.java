package code.task1;

public class TeaApp {
    public static void main(String[] args) {

        TeaTypes teaTypes = new TeaTypes();
        TeaCollection teaCollection = new TeaCollection(6);

        teaCollection.printCollection();

        TeaProducer teaProducer1 = new TeaProducer("Lipton");
        TeaProducer teaProducer2 = new TeaProducer("Apsara");
        TeaProducer teaProducer3 = new TeaProducer("GreenField");
        TeaProducer teaProducer4 = new TeaProducer("Princess Nuri");
        TeaProducer teaProducer5 = new TeaProducer("Askold");


        Tea tea1 = new Tea(1,teaProducer1, "Limon", teaTypes, 0);
        Tea tea2 = new Tea(2,teaProducer2, "Melon", teaTypes, 2);
        Tea tea3 = new Tea(3,teaProducer3, "Black Earl Grey", teaTypes, 0);
        Tea tea4 = new Tea(4,teaProducer4, "Herbal", teaTypes, 2);
        Tea tea5 = new Tea(5,teaProducer5, "Green + Mint", teaTypes, 1);
        Tea tea6 = new Tea(6,teaProducer2, "Japan Cherry", teaTypes, 3);
        Tea tea7 = new Tea(7,teaProducer4, "Carcade", teaTypes, 3);
        Tea tea8 = new Tea(8,teaProducer1, "Green Jasmine", teaTypes, 1);

        if (teaCollection.add(tea1) >= 0) {
            System.out.println("Чай успешно добавлен");
        } else {
            System.out.println("Добавить не удалось - нет свободного места");
        }


        teaCollection.add(tea2);
        teaCollection.add(tea3);
        teaCollection.add(tea4);
        teaCollection.add(tea5);
        teaCollection.add(tea6);
        teaCollection.add(tea7);

        if (teaCollection.add(tea8) >= 0) {
            System.out.println("Чай успешно добавлен");
        } else {
            System.out.println("Добавить не удалось - нет свободного места");
        }


        teaCollection.printCollection();


        int teaSearchIndex = 3;

        System.out.println("Чай но индексу: " + teaSearchIndex + " : " + teaCollection.findById(teaSearchIndex));

    }
}
