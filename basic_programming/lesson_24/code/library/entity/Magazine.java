package code.library.entity;

public class Magazine extends LibraryElement{

    private int issueNumber;
    private int issueYear;

    public Magazine(int id, String title, int issueNumber, int issueYear) {
        super(id, title);
        this.issueNumber = issueNumber;
        this.issueYear = issueYear;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public int getIssueYear() {
        return issueYear;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issueNumber=" + issueNumber +
                ", issueYear=" + issueYear +
                '}';
    }
}
