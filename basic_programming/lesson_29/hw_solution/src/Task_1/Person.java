package Task_1;

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
        if (!(o instanceof Person person)) return false;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public int compareTo(Person anotherPerson) {
        int compareResult = surname.compareTo(anotherPerson.getSurname());
        if (compareResult == 0){
            compareResult = name.compareTo(anotherPerson.getName());
        }
        return compareResult;
    }
}
