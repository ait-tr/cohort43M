package code.arrayLIstObjects;

import java.util.ArrayList;

public class PersonDatabase {
    public static void main(String[] args) {

        ArrayList<Person> personArrayList = new ArrayList<>();

        personArrayList.add(new Person("Ruslan", 29, 234652346));
        personArrayList.add(new Person("Petr", 31, 4673473));
        personArrayList.add(new Person("Victor", 39, 26262647));
        personArrayList.add(new Person("Vlad", 25, 67546836));
        personArrayList.add(new Person("Olga", 18, 989567895));
        personArrayList.add(new Person("Alina", 18, 1465457347));


        for (int i = 0; i < personArrayList.size(); i++) {

            Person currentPerson = personArrayList.get(i);
            currentPerson.say();
            currentPerson.setAge(currentPerson.getAge() + 1);
            System.out.println("Мне теперь: " + currentPerson.getAge());
        }


    }
}
