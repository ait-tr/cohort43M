package pet.model;

public class Pet {

    private int id;
    private String species;
    private int age;
    private String name;

    public Pet(int id, String breed, int age, String name) {
        this.id = id;
        this.species = breed;
        this.age = age;
        this.name = name;
    }
//getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return species;
    }

    public void setBreed(String breed) {
        this.species = breed;
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
        return "Employee{" +
                "id=" + id +
                ", breed='" + species + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void sleep () { System.out.println(name +  " is sleeping!");}
    public void eat () { System.out.println(name + " is eating! ");}
    public void bark () { System.out.println(name +  " is barking! ");}
    public void play () { System.out.println(name + " is playing! ");}
    public void walk () { System.out.println(name +  " is walking! ");}

}

