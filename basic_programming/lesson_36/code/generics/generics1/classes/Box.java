package code.generics.generics1.classes;

public class Box <MyType> {

   private MyType item;

    public MyType getItem() {
        return item;
    }

    public void putItem(MyType item) {
        this.item = item;
    }

    /**
     *
     *  * Рекомендации Oracle об обозначении типов в дженериках
     *      * T - type, для обозначения параметра в произвольных классах
     *      * N - number, для чисел
     *      * E - element, для элементов параметризованных коллекций
     *      * K - key, для ключей map-структур
     *      * V - value, для значений map-структур

     *      S, U, V - применяются, когда в дженерик-классе несколько параметров
     */

}
