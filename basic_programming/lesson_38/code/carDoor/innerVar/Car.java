package code.carDoor.innerVar;

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

    public Door[] getDoors() {
        return doors;
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


    public class Door {
        private int length;
        private int height;
        private boolean isOpen;

        public Door(int length, int height, boolean isOpen) {
            this.length = length;
            this.height = height;
            this.isOpen = isOpen;
        }

        public void open(){
            if (!isOpen) {
                isOpen = true;
                System.out.println("Дверь открывается!");
            } else {
                System.out.println("Дверь уже открыта!");
            }
        }

        public void close(){
            if (isOpen) {
                isOpen = false;
                System.out.println("Дверь закрывается!");
            } else {
                System.out.println("Дверь уже закрыта!");
            }
        }
    }
}
