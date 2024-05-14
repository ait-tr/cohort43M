package code.library.service;

import code.library.entity.LibraryElement;
import code.library.entity.Reader;
import code.library.repository.LibraryRepository;
import code.library.repository.ReaderRepository;

public class ReaderLendService {

    private LibraryRepository libraryRepository;
    private ReaderRepository readerRepository;

    public ReaderLendService(LibraryRepository libraryRepository, ReaderRepository readerRepository) {
        this.libraryRepository = libraryRepository;
        this.readerRepository = readerRepository;
    }

    public boolean makeLend(int readerId, String title){

        LibraryElement foundedElement = libraryRepository.findByTitle(title);

        Reader foundedReader = readerRepository.findById(readerId);

        if (foundedElement != null && foundedReader != null) {
            foundedElement.setIdReader(readerId);
            LibraryElement[] elements = foundedReader.getElements();
            for (int i = 0; i < elements.length; i++) {
                if (elements[i] == null) {
                    elements[i] = foundedElement;}
                return true;
            }
            return false;

        } else {
            System.out.println("Невозможно выдать книгу этому читателю");
            return false;
        }

    }

}
