package code.collections.interfaceExample;

public class InterfacesRealise implements Interface1, Interface2{
    @Override
    public void method11() {
        System.out.println("Метод № 1 из интерфейса 1");
    }

    @Override
    public void method12() {
        System.out.println("Метод № 2 из интерфейса 1");
    }

    @Override
    public void method21() {
        System.out.println("Метод № 1 из интерфейса 2");
    }

    @Override
    public void method22() {
        System.out.println("Метод № 2 из интерфейса 2");
    }
}
