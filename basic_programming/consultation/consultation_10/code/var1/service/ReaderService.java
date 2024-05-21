package code.var1.service;

import code.var1.entity.Reader;
import code.var1.repository.ReaderRepository;

public class ReaderService {

    private ReaderRepository repository;

    public ReaderService(ReaderRepository repository) {
        this.repository = repository;
    }

    public Reader addNewReader(String readerName){
        Reader newReader = new Reader(readerName);
        return repository.add(newReader);
    }

    public Reader findById(Integer readerId){
        return repository.findById(readerId);
    }

    public Reader findByName(String readerName){
        return repository.findByName(readerName);
    }

}
