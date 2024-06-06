package code.generics.generics3;

import java.util.ArrayList;
import java.util.List;

public class ContainerDemo {
    public static void main(String[] args) {


        List<String> strings = new ArrayList<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Four");


        Container<List<String>> container1 = new Container<>(strings);
        container1.printData("List");



        //--------

        Container<Double> container2 = new Container<>(10.5);
        container2.printData("Double");
    }
}
