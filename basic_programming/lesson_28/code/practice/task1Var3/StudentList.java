package code.practice.task1Var3;
import java.util.List;

class StudentList {
    private Person person;
    private List<PairSubjectMark> grades;

    public StudentList(Person person, List<PairSubjectMark> grades) {
        this.person = person;
        this.grades = grades;
    }
}

