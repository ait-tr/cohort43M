package code.practice.task1Var3;

public class PairSubjectMark {

    private String subject;
    private Double mark;

    public PairSubjectMark(String subject, Double mark) {
        this.subject = subject;
        this.mark = mark;
    }

    public String getSubject() {
        return subject;
    }

    public Double getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "PairSubjectMark{" +
                "subject='" + subject + '\'' +
                ", mark=" + mark +
                '}';
    }
}
