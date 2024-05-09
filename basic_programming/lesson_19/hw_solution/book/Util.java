package homework.book;

import java.util.Arrays;
import java.util.List;

public class Util {

    public static Book createBook(int id, String title, String author, String genre) {
        return new Book(id,title,author,genre);
    }
}
