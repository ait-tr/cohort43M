public class Pet {
    private int id;
    private String breed;
    private int age;
    private String nickName;

    public Pet(int id, String breed, int age, String nickName) {
        this.id = id;
        this.breed = breed;
        this.age = age;
        this.nickName = nickName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
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
    public void petsDogs(){
        System.out.println("Id: " + id + " |Breed: " + breed + " |Age: " + age + " |Nickname: " + nickName);
    }
    public void sleep(){
        System.out.println(nickName + " is sleep");
    }
    public void thereIs(){
        System.out.println(nickName + " is eating");
    }
    public void makeSound(){
        System.out.println(nickName + " make sound");
    }
    public void play(){
        System.out.println(nickName + " is play");
    }

}



