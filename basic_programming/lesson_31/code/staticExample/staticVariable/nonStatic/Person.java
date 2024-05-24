package code.staticExample.staticVariable.nonStatic;

public class Person {

    public String name;

    public String town;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", town='" + town + '\'' +
                '}';
    }
}
