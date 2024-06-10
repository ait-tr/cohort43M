package code.streamPractice.task3;

import java.util.HashSet;
import java.util.Set;

public class Student {

    private String name;
    private Set<String> book;

    public Student(String name) {
        this.name = name;
        this.book = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<String> getBook() {
        return book;
    }

    public void addBook(String book){
        this.book.add(book);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", book=" + book +
                '}';
    }
}
