package code.inheritiance.dog;

public class Dog {

    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void voice(String message){
        System.out.println("GAV GAV");
        System.out.println(message);
    }

}
