package code.arrayLIstObjects;

import java.util.Objects;

public class Person {

    private String name;
    private Integer age;
    private Integer personalCode;

    public Person(String name, Integer age, Integer personalCode) {
        this.name = name;
        this.age = age;
        this.personalCode = personalCode;
    }

    public void say() {
        System.out.println("Привет! Меня зовут " + name);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getPersonalCode() {
        return personalCode;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object anotherObject) {
        if (this == anotherObject) return true;
        if (anotherObject == null || getClass() != anotherObject.getClass()) return false;
        Person person = (Person) anotherObject;
        return Objects.equals(name, person.name) && Objects.equals(personalCode, person.personalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, personalCode);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", personalCode=" + personalCode +
                '}';
    }


}
