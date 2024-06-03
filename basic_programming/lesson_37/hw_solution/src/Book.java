public class Book <T>{
    private T title;
    private T genre;

    public Book(T title, T genre) {
        this.title = title;
        this.genre = genre;
    }

    public T getTitle() {
        return title;
    }

    public T getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

}
