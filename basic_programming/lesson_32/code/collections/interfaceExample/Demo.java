package code.collections.interfaceExample;

public class Demo {
    public static void main(String[] args) {

        InterfacesRealise interfacesRealise = new InterfacesRealise();

        interfacesRealise.method11();
        interfacesRealise.method12();
        interfacesRealise.method21();
        interfacesRealise.method22();

        System.out.println("================");

        Interface1 interface1 = new InterfacesRealise();
        interface1.method11();
        interface1.method12();

        System.out.println("================");

        Interface2 interface2 = new InterfacesRealise();
        interface2.method21();
        interface2.method22();


    }
}
