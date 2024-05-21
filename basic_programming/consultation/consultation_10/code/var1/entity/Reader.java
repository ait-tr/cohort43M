package code.var1.entity;

import java.util.ArrayList;
import java.util.List;

public class Reader {

    private Integer readerId;
    private String readerName;
    private List<Book> readerBooks;

    public Reader(Integer readerId, String readerName, List<Book> readerBooks) {
        this.readerId = readerId;
        this.readerName = readerName;
        this.readerBooks = new ArrayList<>();
    }

    public Integer getReaderId() {
        return readerId;
    }

    public String getReaderName() {
        return readerName;
    }

    public List<Book> getReaderBooks() {
        return readerBooks;
    }


    public void setReaderId(Integer readerId) {
        this.readerId = readerId;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "readerId=" + readerId +
                ", readerName='" + readerName + '\'' +
                ", readerBooks=" + readerBooks +
                '}';
    }
}
