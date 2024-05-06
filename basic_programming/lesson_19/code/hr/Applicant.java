package code.hr;

public class Applicant {

    private int id;
    private Person person;
    private boolean isAgree;

    public Applicant(int id, Person person, boolean isAgree) {
        this.id = id;
        this.person = person;
        this.isAgree = isAgree;
    }

    public int getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public boolean isAgree() {
        return isAgree;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "id=" + id +
                ", person=" + person +
                ", isAgree=" + isAgree +
                '}';
    }
}
