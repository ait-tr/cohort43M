package code.generics.generics2.classes;

// upper bounding - ограничение сверху

import code.generics.generics2.Garbage;

public class Box <MyType extends Garbage> {

   private MyType item;

    public MyType getItem() {
        return item;
    }

    public void putItem(MyType item) {
        this.item = item;
    }

    public double getItemWeight(){
        return item == null ? 0 : item.getWeight();
    }
}
