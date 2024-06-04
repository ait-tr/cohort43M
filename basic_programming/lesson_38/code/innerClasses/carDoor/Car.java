package code.innerClasses.carDoor;

public class Car {
    private int numberOfDoors;
    private Door[] doors;

    public Car(int numberOfDoors, int doorLength, int doorHeight) {
        this.numberOfDoors = numberOfDoors;
        this.doors = new Door[numberOfDoors];

        for (int i = 0; i < numberOfDoors; i++) {
            doors[i] = new Door(doorLength, doorHeight, false);
        }
    }
    public void openDoor(int indexDoor){
        if (indexDoor >= 0 && indexDoor < numberOfDoors){
            doors[indexDoor].open();
        } else {
            System.out.println("неправильный номер двери");
        }
    }
    public void closeDoor(int indexDoor){
        if (indexDoor >= 0 && indexDoor < numberOfDoors){
            doors[indexDoor].close();
        } else {
            System.out.println("неправильный номер двери");
        }
    }

}
