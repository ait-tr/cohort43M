package code.withCollections.repository;

import code.withCollections.entity.BookAndReader;

import java.util.ArrayList;
import java.util.List;

public class BookAndReaderRepository {

    List<BookAndReader> repository = new ArrayList<>();

    public boolean addNewRecord(BookAndReader record){
        return repository.add(record);
    }

    public Integer findByBookId(Integer bookId){
        for (BookAndReader record : repository){
            if (record.getBookId() == bookId) {
                return record.getReaderId();
            }
        }
        return -1;
    }

    public List<Integer> findByReaderId(Integer readerId){
        List<Integer> booksIdForReader = new ArrayList<>();
        for (BookAndReader record : repository) {
            if (record.getReaderId() == readerId) {
                booksIdForReader.add(record.getBookId());
            }
        }
        return booksIdForReader;
    }

}
