package code;

import java.util.Arrays;

public class BookStorage {

    private String lineId;
    private int numberOfShelves;
    private BookShelf[] bookShelves;
    private Author[] authors;

    public BookStorage(String lineId, int numberOfShelves) {
        this.lineId = lineId;
        this.numberOfShelves = numberOfShelves;
        this.bookShelves = new BookShelf[numberOfShelves];
    }

    public String getLineId() {
        return lineId;
    }

    public BookShelf[] getBookShelves() {
        return bookShelves;
    }

    @Override
    public String toString() {
        return "BookStorage{" +
                "lineId='" + lineId + '\'' +
                ", bookShelves=" + Arrays.toString(bookShelves) +
                '}';
    }
}
