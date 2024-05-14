package code.library.entity;

public abstract class LibraryElement {
    private int id;
    private String title;
    private int idReader = 0;

    public LibraryElement(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setIdReader(int idReader) {
        this.idReader = idReader;
    }

    public int getIdReader() {
        return idReader;
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
