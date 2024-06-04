package code.innerClasses.carDoor;

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
