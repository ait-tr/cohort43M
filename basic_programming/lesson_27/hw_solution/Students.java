package Homework.Students;

import java.util.Objects;

public class Students {
    String studentName;

    public Students(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Students students)) return false;
        return Objects.equals(getStudentName(), students.getStudentName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentName());
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentName='" + studentName + '\'' +
                '}';
    }


}
