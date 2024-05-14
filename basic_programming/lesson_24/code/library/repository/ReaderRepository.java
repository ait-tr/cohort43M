package code.library.repository;

import code.library.entity.Book;
import code.library.entity.Reader;

public class ReaderRepository {

    private Reader[] readers;
    private int count = 0;

    public ReaderRepository(int quantityReaders) {
        this.readers = new Reader[quantityReaders];
    }

    public boolean add(Reader reader){
        if (count < readers.length) {
            readers[count] = reader;
            count++;
            return true;
        }

        return false;
    }


    public Reader findById(int idForSearch){
        for (int i = 0; i < count; i++) {
            if (readers[i].getId() == idForSearch){
                return readers[i];
            }
        }
        return null;
    }

}
