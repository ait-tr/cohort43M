package code.practice.var3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepository {

    Map<String,List<Student>> students;
    private Integer studentCounter = 0;

    public StudentRepository() {
        this.students = new HashMap<>();
    }

    public Student addStudent(Student student) {
        student.setId(++studentCounter);

        if (students.get(student.getGroup()) == null) {
            students.put(student.getGroup(), new ArrayList<>());
        }

        List<Student> studentListFromMap = students.get(student.getGroup());

        studentListFromMap.add(student);

        System.out.println(students);
        return student;
    }

    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        for (String group : students.keySet()) {
            studentList.addAll(students.get(group));
        }
        return studentList;
    }

    public List<Student> findByGroup(String group){
      return students.get(group);
        }
}
