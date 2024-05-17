package code.mapKeyCollision;

import java.util.HashMap;
import java.util.Map;

public class ChangeKeyMapExample {
    public static void main(String[] args) {

        Map<PersonForCat, Cat> map = new HashMap<>();

        map.put(new PersonForCat("Petya"), new Cat("Barsik"));

        System.out.println(map);

        PersonForCat person = new PersonForCat("Vasja");
        Cat cat = new Cat("Murzik");
        map.put(person,cat);

        System.out.println(map);


        System.out.println("Person 'Vasja' hashcode() = " + person.hashCode());

        System.out.println("==== Изменим имя у person ======");

        person.name = "Basil";

        System.out.println(map);

        Cat catFromCollection = map.get(person);

        System.out.println(person);
        System.out.println(person.hashCode());

        System.out.println(catFromCollection);

        System.out.println("===== попробуем добрать до кота =====");

        PersonForCat personVasja = new PersonForCat("Vasja");
        System.out.println("HashCODE для 'дубликата' нашего person = " + personVasja.hashCode());

        catFromCollection = map.get(personVasja);

        System.out.println(catFromCollection);

        System.out.println("========== ВОЩВРАЩАЕМ ОБРАТНО ========");
        person.name = "Vasja";
        System.out.println(person);
        System.out.println(person.hashCode());
        catFromCollection = map.get(person);
        System.out.println(catFromCollection);




    }
}
