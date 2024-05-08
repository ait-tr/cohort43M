package code.polimorphism.music;

public class PopMusician implements Musician{
    @Override
    public void greeting() {
        System.out.println("Pop greeting!");
    }

    @Override
    public void dance() {
        System.out.println("Pop dancing");
    }

    @Override
    public void sing() {
        System.out.println("Pop singer");
    }
}
