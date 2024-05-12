package hwlesson21.Inheritiance.task1;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("KS-Cycling","Mountain-Bike Xtinct", 2020,"Mountain-Bike");
        Car car = new Car("BMW","iX2",2023,4);
        System.out.println(bicycle.toString());
        bicycle.isMoving();
        car.startEngine();
        car.isMoving();
        System.out.println(car.toString());
    }


}
