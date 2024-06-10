package code.person;

import code.person.Ability;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Integer age;
    private List<Ability> skills;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.skills = new ArrayList<>();
    }
    public void addSkills(Ability skill){
        skills.add(skill);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<Ability> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skills=" + skills +
                '}';
    }
}
