package pet.model;

public class Pet {

    private int id;
    private String type;
    private double age;
    private  String nickName;

    public Pet(int id, String type, double age, String nickName) {
        this.id = id;
        this.type = type;
        this.age = age;
        this.nickName = nickName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
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
                ", type='" + type + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public void sleep(){
        System.out.println(nickName +" "+ type + " is sleeping");
    }
    public void eat(){
        System.out.println(nickName +" "+ type + " is eating");
    }
    public void growl(){
        System.out.println(nickName +" "+ type + " growl");
    }
    public void play(){
        System.out.println(nickName +" "+ type + " playing");
    }
    public void walk(){
        System.out.println(nickName +" "+ type + " walking");
    }
}
