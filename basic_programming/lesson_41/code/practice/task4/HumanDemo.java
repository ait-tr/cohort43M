package code.practice.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HumanDemo {
    public static void main(String[] args) {
        /*
        создать коллекцию с номерами всех телефонов
         */

        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Ruslan", Arrays.asList("+2342365362","+2453676734")));
        humans.add(new Human("Victor", Arrays.asList("+6573673467","+94769478")));
        humans.add(new Human("Petr", Arrays.asList("+1235634673467","+43534574357")));

        // -- циклами ----
        List<String> phones = new ArrayList<>();

        for (Human human : humans){
            phones.addAll(human.getPhones());
        }
        System.out.println(phones);

        // ------ stream ----

        List<String> phonesByStream = humans.stream()
                .flatMap(human -> human.getPhones().stream())
                .toList();

        System.out.println(phonesByStream);

    }
}
