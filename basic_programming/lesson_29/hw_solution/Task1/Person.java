package code.Task1;

//Создайте класс Person с двумя параметрами (имя и фамилия)
// Создайте коллекцию уникальных элементов отсортированных по фамилии и имени

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int compareTo(Person other) {
        int surnameComparison = this.surname.compareTo(other.surname);
        if (surnameComparison != 0) {
            return surnameComparison;
        } else {
            return this.name.compareTo(other.name);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}

