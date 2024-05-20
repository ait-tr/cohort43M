package dictionary;

public class Meaning {
    private int id;
    private String designation;

    public Meaning(int id, String designation) {
        this.id = id;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "Meaning{" +
                "designation='" + designation + '\'' +
                '}';
    }
}

