package code.HomeWork.Task3;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public int compareTo(Student other) {
        int lastNameComparison = this.lastName.compareTo(other.lastName);
        if(lastNameComparison !=0){
            return lastNameComparison;
        }else {
            return this.firstName.compareTo(other.firstName);
        }
    }
}
