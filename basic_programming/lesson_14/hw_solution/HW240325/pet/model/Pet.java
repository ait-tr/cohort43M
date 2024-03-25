package HW240325.pet.model;
/*
Task 1. Create a Pet class with private fields:

id
view
age
nickname
Standard methods:

constructor for all fields;
getters and setters for all fields;
toString method.
Additional methods:

sleep
There is
make sound
play
walk
In the PetAppl class, create several pet instances. Display the day lived.
 */
public class Pet {

    private int id;
    private String kind;
    private int age;
    private String nickName;

    //constructor
    public Pet(int id, String kind, int age, String nickName) {
        this.id = id;
        this.kind = kind;
        this.age = age;
        this.nickName = nickName;
    }

    //display method
    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", kind='" + kind + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void thereIs () {
        System.out.println("There is " + nickName + ", the " + kind + " " + age + " years old\n");
    }

    public void sleep () {
        System.out.println(kind + " " + nickName + " is sleeping\n");
    }

    public void makeSound () {
        System.out.println(nickName + " the " + kind + " is making a sound\n");
    }

    public void play () {
        System.out.println(nickName + " the " + kind + " is playing\n");
    }

    public void walk () {
        System.out.println(nickName + " the " + kind + " is walking\n");
    }

}
