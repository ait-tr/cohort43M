package code.inheritiance.dog;

public class SmallDog {

    private String name;
    private String breed;

    public SmallDog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void voiceSmallDog(){
        System.out.println("gav gav gav gav");
    }

    public void visitGroomer() {
        System.out.println("Провели груминг-процедуры");
    }

}
