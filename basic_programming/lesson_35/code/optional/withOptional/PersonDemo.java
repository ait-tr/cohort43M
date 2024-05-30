package code.optional.withOptional;

import java.util.Optional;

public class PersonDemo {
    public static void main(String[] args) {

        PersonRepository repository = new PersonRepository();

        repository.addPerson(1, new Person("Bill"));
        repository.addPerson(5, new Person("James"));
        repository.addPerson(7, new Person("John"));
        repository.addPerson(10, new Person());

        Optional<Person> foundedOptionalPerson = repository.findById(1L);

        if (foundedOptionalPerson.isPresent()) {
            Person foundedPerson = foundedOptionalPerson.get();
            System.out.println(foundedPerson);
        } else {
            System.out.println("Такого не найдено");
        }

    }
}
