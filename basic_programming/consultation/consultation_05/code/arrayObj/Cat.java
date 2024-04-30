package arrayObj;

public class Cat {

    String breed;
    String name;
    String color;

    public Cat(String breed, String name, String color) {
        this.breed = breed;
        this.name = name;
        this.color = color;
    }

    public void printData() {
        System.out.println("Порода кошки: " + breed + ", кличка кошки: " + name + ", цвет окраса: " + color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
