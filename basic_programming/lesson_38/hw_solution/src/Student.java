import java.util.List;

public class Student {
    private String name;
    private String surname;
    private Integer id;
    private List<Course> courses;

    public Student(String name, String surname, Integer id) {
        this.name = name;
        this.surname = surname;
        this.id  = id;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getId() {
        return id;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numberOfStudent=" + id +
                ", courses=" + courses +
                '}';
    }
}
