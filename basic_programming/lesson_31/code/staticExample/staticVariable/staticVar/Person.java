package code.staticExample.staticVariable.staticVar;

public class Person {

    public String name;

    public static String town;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", town='" + town + '\'' +
                '}';
    }
}
