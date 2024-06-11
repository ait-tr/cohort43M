package code.task3;

public class Purchase {
    private String title;
    private double prise;

    public Purchase(String title, double prise) {
        this.title = title;
        this.prise = prise;
    }

    public String getTitle() {
        return title;
    }

    public double getPrise() {
        return prise;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "title='" + title + '\'' +
                ", prise=" + prise +
                '}';
    }
}
