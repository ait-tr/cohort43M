package code.withCollections.repository;

import code.withCollections.entity.Book;
import code.withCollections.entity.Reader;

import java.util.ArrayList;
import java.util.List;

public class ReaderRepository {

    List<Reader> readers = new ArrayList<>();

    public boolean addNewReader(Reader reader){
        return readers.add(reader);
    }

    public Reader findById(Integer id){
        for (Reader reader : readers){
            if (reader.getReaderId() == id ){
                return reader;
            }
        }
        return null;
    }

    public void printInfo(){
        for (Reader reader : readers){
            System.out.println(reader);
        }
    }

}
