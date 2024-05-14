package code.library.entity;

public abstract class LibraryElement {
    private int id;
    private String title;

    public LibraryElement(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "LibraryElement{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
