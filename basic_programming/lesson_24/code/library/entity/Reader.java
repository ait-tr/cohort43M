package code.library.entity;

public class Reader {

    private int id;
    private String name;
    private LibraryElement[] elements;

    public Reader(int id, String name) {
        this.id = id;
        this.name = name;
        this.elements = new LibraryElement[3];
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LibraryElement[] getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
