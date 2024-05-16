package code.withCollections.service;

import code.withCollections.entity.Book;
import code.withCollections.entity.Reader;
import code.withCollections.repository.BookRepository;
import code.withCollections.repository.ReaderRepository;

import java.util.List;

public class ReaderService {

    ReaderRepository repository;
    Integer counter = 1;


    public ReaderService(ReaderRepository repository) {
        this.repository = repository;
    }


    public Reader createReader(){
        return new Reader(
                counter,
                "reader name " + counter++
        );
    }

    public boolean addNewReader(Reader reader){
        
        boolean addResult = repository.addNewReader(reader);
        if (addResult) {
            System.out.println("Читатель успешно добавлена");
        } else {
            System.out.println("Читателя добавить не удалось");
        }
        return addResult;
    }

    public Reader findById(Integer readerId){
        return repository.findById(readerId);
    }


}
