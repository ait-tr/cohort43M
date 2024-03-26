package Pet.model;

public class Pet {
    private int id;
    private String view;
    private double age;
    private String nickname;

    public Pet(int id, String view, double age, String nickname) {
        this.id = id;
        this.view = view;
        this.age = age;
        this.nickname = nickname;
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

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", view='" + view + '\'' +
                ", age=" + age +
                ", nickname='" + nickname + '\'' +
                '}';
    }
public void sleep(){
    System.out.println(view + " " + nickname + " is sleeping");
}
public void eating(){
    System.out.println(view + " " + nickname + " is eating");
}
public void makrSound(){
    System.out.println(view + " " + nickname + " is making a sound");
}
public void play(){
    System.out.println(view + " " + nickname + " is playing");
}
public void walk(){
    System.out.println(view + " " + nickname + " is walking");
}

}
