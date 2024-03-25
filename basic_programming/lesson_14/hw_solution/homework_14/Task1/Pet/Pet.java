package Pet;
public class Pet {
    /*
    Задача 1. Создать класс Pet (Домашнее животное) с приватными полями:
    id
    вид
    возраст
    кличка

    Стандартные методы:
    конструктор на все поля;
    геттеры и сеттеры на все поля;
    метод toString.

    Дополнительные методы:
    спать
    есть
    делать звук
    играть
    гулять
    В классе PetAppl создать несколько экземпляров домашних животных. Отобразить прожитый день.
     */
    private int id;
    private String view;
    private int age;
    private String nickname;

    public Pet(int id, String view, int age, String nickname) {
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

    public int getAge() {
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

    public String sleep(){
        return nickname + " is sleeping.";
    }
    public String eat(){
        return nickname + " is eating.";
    }
    public String makeSound(){
        return nickname + " is making a sound.";
    }
    public String play(){
        return nickname + " is playing.";
    }
    public String walk(){
        return nickname + " is walking.";
    }
}

