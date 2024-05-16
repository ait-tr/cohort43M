package code.practice.task2;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String courseTitle;
    private Teacher teacher;
    private List<Student> students;

    public Course(String courseId, String courseTitle) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.students = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseTitle='" + courseTitle + '\'' +
                ", teacher=" + teacher +
                ", students=" + students +
                '}';
    }
}
