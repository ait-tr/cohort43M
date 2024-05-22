package code.compareObjects.comparable;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Book implements Comparable<Book>{

    private Integer id;
    private String title;

    public Book(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int compareTo(@NotNull Book book) {
        int compareResult = id - book.getId();
        if (compareResult == 0) {
            compareResult = title.compareTo(book.getTitle());
        }
        return compareResult;
    }
}
