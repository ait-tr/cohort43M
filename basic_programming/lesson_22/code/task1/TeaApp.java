package code.task1;

public class TeaApp {
    public static void main(String[] args) {

        TeaTypes teaTypes = new TeaTypes();
        TeaCollection teaCollection = new TeaCollection(10);

        teaCollection.printCollection();

        TeaProducer teaProducer1 = new TeaProducer("Lipton");
        TeaProducer teaProducer2 = new TeaProducer("Apsara");
        TeaProducer teaProducer3 = new TeaProducer("GreenField");
        TeaProducer teaProducer4 = new TeaProducer("Princess Nuri");
        TeaProducer teaProducer5 = new TeaProducer("Askold");


        Tea tea1 = new Tea(1,teaProducer1, "Limon", teaTypes, 0);
        teaCollection.add(tea1);


        teaCollection.printCollection();


    }
}
