package homework.ext.ext1;

public class App {
    public static void main(String[] args) {

        Car car = new Car(2016, "WV", 4,5);
        Bicycle bicycle = new Bicycle(2019, "Aist",2, false);

        System.out.println("My car is " + car.getBrand() + " " + car.getYear() + " " + car.getNumberOfDoors() + " " + car.getNumberOfWheels());
        System.out.println("My bicycle is " + bicycle.getBrand() + " " + bicycle.getYear() + " " + bicycle.getNumberOfWheels());

        car.service();
        bicycle.service();
    }
}
