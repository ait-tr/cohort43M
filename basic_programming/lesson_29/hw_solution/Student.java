package Homework_29.task2;

import java.util.Objects;

//Дан класс Student
//Student {
//   int roll;
//   String name;
//}
//Создать две разных коллекции в которых студенты будут отсортированы по разным критериям
public class Student implements Comparable<Student>{
    private int roll;
    private String name;

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    public Student() {
        super();
    }

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;


    }

    @Override
    public int compareTo(Student o) {
        int compareResult = Integer.compare(roll, o.getRoll());

        if (compareResult == 0) {
            compareResult = name.compareTo(o.getName());
        }

        return compareResult;

    }
}
