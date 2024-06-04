
import java.util.List;

public class Course {
    private String title;
    private List<Student> student;

    public Course(String title) {
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                '}';
    }
}
