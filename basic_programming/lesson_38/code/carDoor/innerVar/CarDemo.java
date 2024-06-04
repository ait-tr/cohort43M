package code.carDoor.innerVar;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car(4,70,100);
        car.openDoor(2);
        car.openDoor(2);
        car.closeDoor(2);
        car.closeDoor(2);

        Car.Door[] doors = car.getDoors();
        for (int i = 0; i < doors.length; i++) {
            System.out.println(doors[i]);
        }

    }
}
