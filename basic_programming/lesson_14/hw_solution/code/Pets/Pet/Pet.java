package Pets.Pet;

public class Pet {

    private int id;
    private String view;
    private int age;
    private String name;

    public Pet(int id, String view, int age, String name) {
        this.id = id;
        this.view = view;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", view='" + view + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    public void sleep(){
        System.out.println(name + " is sleep");
    }
    public void thereIs(){
        System.out.println(name+ " there is my "+view);
    }
    public void play(){
        System.out.println(name+" play with toy");
    }
    public void walk(){
        System.out.println(name+ " is walk");
    }
}
