
import java.util.ArrayList;
import java.util.Objects;

public class Students {
  private String StudentName;

    public Students(String studentName) {
        StudentName = studentName;
    }

    public String getStudentName () {
            return StudentName;
        }

    @Override
    public String toString() {
        return "Students{" +
                "StudentName='" + StudentName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(StudentName, students.StudentName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(StudentName);
    }
}

