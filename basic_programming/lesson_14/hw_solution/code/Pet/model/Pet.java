package Pet.model;

public class Pet {
    private int id;
    private String species;
    private int age;
    private String name;

    public Pet(int id, String species, int age, String name) {
        this.id = id;
        this.species = species;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
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
                ", species='" + species + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    public void sleep () {
        System.out.println("id: " + id + ", name: " + name + ", age: " + age + ", species: " + species + " is sleeping");
    }
    public void eat () {
        System.out.println ("id: " + id + ", name: " + name + ", age: " + age + ", species: " + species + " is eating");
    }
    public void noise (){
        System.out.println("id: " + id + ", name: " + name + ", age: " + age + ", species: " + species + " make noise");
    }
    public void play (){
        System.out.println("id: " + id + ", name: " + name + ", age: " + age + ", species: " + species + " is playing");
    }
    public void walk (){
        System.out.println("id: " + id + ", name: " + name + ", age: " + age + ", species: " + species + " is walking");
    }
}
