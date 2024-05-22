package Homework_29.task1;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

//Создайте класс Person с двумя параметрами (имя и фамилия)
//Создайте коллекцию уникальных элементов отсортированных
//по фамилии и имени
public class Person {
    private String name;
    private  String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && surname.equals(person.surname);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;



    }
}
