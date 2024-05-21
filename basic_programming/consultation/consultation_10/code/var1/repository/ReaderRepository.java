package code.var1.repository;

import code.var1.entity.Author;
import code.var1.entity.Book;
import code.var1.entity.Reader;

import java.util.ArrayList;
import java.util.List;

public class ReaderRepository {
    private List<Reader> readers = new ArrayList<>();
    private Integer readerIdCounter = 0;


    public Reader add(Reader newReader){ //получаем читателя но без id
        newReader.setReaderId(++readerIdCounter); //добавили следующий id
        readers.add(newReader); // сохранили в коллекцию
        return newReader;
    }

    public Reader findById(Integer readerId){
        for (Reader reader : readers){
            if (readerId.equals(reader.getReaderId())) {
                return reader;
            }
        }
        return null;
    }

    public Reader findByName(String readerName){
        for (Reader reader : readers){
            if (readerName.equals(reader.getReaderName())) {
                return reader;
            }
        }
        return null;
    }

    public void printReaderInfo(){
        for (Reader reader : readers){
            System.out.println(reader);
        }
    }

}
