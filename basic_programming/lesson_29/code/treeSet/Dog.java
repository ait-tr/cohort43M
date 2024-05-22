package code.treeSet;

import org.jetbrains.annotations.NotNull;

import java.util.Date;
import java.util.Objects;

public class Dog implements Comparable<Dog>{
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public int compareTo(Dog anotherDog) {
        int compareResult = breed.compareTo(anotherDog.getBreed());

        if (compareResult == 0) {
            compareResult = name.compareTo(anotherDog.getName());
        }

        return compareResult;
    }
}
