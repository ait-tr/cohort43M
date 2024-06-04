package code.innerClass;

import code.nonInner.Bicycle;
import code.nonInner.HandleBar;
import code.nonInner.Seat;

public class BicycleInnerClassDemo {
    public static void main(String[] args) {
      BicycleInnerClass myBicycle = new BicycleInnerClass("Super1", 3);

      BicycleInnerClass.HandelBar handelBarInner = myBicycle.new HandelBar(true);
      BicycleInnerClass.Seat seatInner = myBicycle.new Seat();

      handelBarInner.right();
      seatInner.up();

        System.out.println(myBicycle);
        System.out.println(handelBarInner);
        System.out.println(seatInner);

    }
}
