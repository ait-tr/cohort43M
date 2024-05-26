package homework_29.Student;

import java.util.Objects;

public class Student  {

    private Integer roll;
    private String name;

    public Student(Integer roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public Integer getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(roll, student.roll) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }



}
