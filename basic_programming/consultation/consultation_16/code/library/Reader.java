package code.library;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String fio;
    private String email;
    private boolean subscriber;
    private List<Book> books;

    public Reader(String fio, String email, boolean subscriber) {
        this.fio = fio;
        this.email = email;
        this.subscriber = subscriber;
        this.books = new ArrayList<>();
    }

    public String getFio() {
        return fio;
    }

    public String getEmail() {
        return email;
    }

    public boolean isSubscriber() {
        return subscriber;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fio='" + fio + '\'' +
                ", email='" + email + '\'' +
                ", subscriber=" + subscriber +
                ", books=" + books +
                '}';
    }
}
