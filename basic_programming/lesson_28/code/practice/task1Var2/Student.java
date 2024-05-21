package code.practice.task1Var2;
import java.util.HashMap;
import java.util.Map;

class Student {
    private String name;
    private Map<String, Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(String subject, int grade) {
        grades.put(subject, grade);
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }
}

