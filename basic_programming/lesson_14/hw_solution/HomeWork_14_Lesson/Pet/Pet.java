package HomeWork_14_Lesson.Pet;

public class Pet {
    private int id;
    private String kindOfPet;
    private int age;
    private String nickName;

    public Pet(int id, String kindOfPet, int age, String nickName) {
        this.id = id;
        this.kindOfPet = kindOfPet;
        this.age = age;
        this.nickName = nickName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKindOfPet() {
        return kindOfPet;
    }

    public void setKindOfPet(String kindOfPet) {
        this.kindOfPet = kindOfPet;
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

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", kindOfPet='" + kindOfPet + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public void displayPet(){
        System.out.println("Pet{" +
                " id= " + id +
                ", kindOfPet='" + kindOfPet + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}');
    }
    public void sleep(){
        System.out.println(nickName+" Sleep");
    }
    public void eat(){
        System.out.println(nickName+" eat");
    }
    public void sound(){
        System.out.println(nickName+" sound");
    }
    public void play(){
        System.out.println(nickName+" play");
    }
    public void walk(){
        System.out.println(nickName+" walk");
    }
}
